package net.theivan066.randomthingsmod.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class ExplosiveArrowEntity extends ArrowEntity {
    public ExplosiveArrowEntity(EntityType<? extends ArrowEntity> entityType, World world) {
        super(entityType, world);
    }

    public ExplosiveArrowEntity(World world, LivingEntity shooter) {
        super(world, shooter);
    }

    @Override
    protected void onHit(LivingEntity target) {
        super.onHit(target);
        explode();
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        explode();
    }

    private void explode() {
        if (!this.getWorld().isClient) {
            float power = 1.0F; // Adjust the explosion power as desired
            boolean createFire = false; // Set to true if you want to create fire at the explosion site
            Explosion explosion = new Explosion(this.getWorld(),this, this.getX(), this.getY(), this.getZ(), power, false, Explosion.DestructionType.DESTROY);
            explosion.affectWorld(true);
        }
        this.remove(RemovalReason.DISCARDED);
    }
}
