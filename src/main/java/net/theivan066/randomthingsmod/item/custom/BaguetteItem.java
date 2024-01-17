package net.theivan066.randomthingsmod.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.item.ModItems;

import java.util.Objects;

public class BaguetteItem extends Item {
    public static double reach = 0;
    public static double attack_range = 0;
    private static LivingEntity liver = null;
    private static boolean active = false;
    public BaguetteItem(Settings settings, double reachBonus, double attackReachBonus) {
        super(settings);
        reach = reachBonus;
        attack_range = attackReachBonus;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        {
            if(active != (((LivingEntity)entity).getStackInHand(Hand.MAIN_HAND).getItem() == this))
            {
                System.out.println("New enitiy reaching: " + entity);
                liver = (LivingEntity)entity;
                SetRange(((LivingEntity)entity).getStackInHand(Hand.MAIN_HAND).getItem() == this);
            }
            active = ((LivingEntity)entity).getStackInHand(Hand.MAIN_HAND).getItem() == this;
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }


    public void SetRange(boolean change_range)
    {
        if (change_range)
        {
            System.out.println("On");
            liver.getAttributeInstance(RandomThingsMod.REACH).setBaseValue(reach);
            liver.getAttributeInstance(RandomThingsMod.ATTACK_RANGE).setBaseValue(attack_range);
        }
        else
        {
            System.out.println("Off");
            liver.getAttributeInstance(RandomThingsMod.REACH).setBaseValue(0.0);
            liver.getAttributeInstance(RandomThingsMod.ATTACK_RANGE).setBaseValue(0.0);
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (Objects.equals(attacker.getActiveItem(), new ItemStack(ModItems.BAGUETTE))) {
            target.damage(target.getDamageSources().mobAttack(attacker), 2);
        } else if (Objects.equals(attacker.getActiveItem(), new ItemStack(ModItems.HUMONGOUS_BAGUETTE))) {
            target.damage(target.getDamageSources().mobAttack(attacker), 3);
        }
        return super.postHit(stack, target, attacker);
    }
}
