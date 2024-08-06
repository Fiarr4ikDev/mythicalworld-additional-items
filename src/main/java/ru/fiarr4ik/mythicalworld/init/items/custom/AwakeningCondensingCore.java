package ru.fiarr4ik.mythicalworld.init.items.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class AwakeningCondensingCore extends Item {

        public AwakeningCondensingCore(Properties properties) {
            super(properties);
        }

        @Override
        public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

            if (Screen.hasShiftDown()) {
                tooltip.add(new TranslationTextComponent("awakening-condenser-core"));
            } else {
                tooltip.add(new TranslationTextComponent("shift"));
            }


            super.appendHoverText(stack, worldIn, tooltip, flagIn);
        }
    }
