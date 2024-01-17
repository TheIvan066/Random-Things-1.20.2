package net.theivan066.randomthingsmod.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.theivan066.randomthingsmod.RandomThingsMod;

public class SpearItem extends SwordItem {
    public static double reach = 0;
    public static double attack_range = 0;
    private static LivingEntity liver = null;
    private static boolean active = false;

    public SpearItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, double reachBonus, double attackReachBonus) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
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

}


