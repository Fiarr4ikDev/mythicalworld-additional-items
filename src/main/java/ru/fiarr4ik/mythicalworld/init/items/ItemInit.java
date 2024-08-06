package ru.fiarr4ik.mythicalworld.init.items;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.fiarr4ik.mythicalworld.Mythicalworld;
import ru.fiarr4ik.mythicalworld.init.items.custom.AwakeningCondensingCore;
import ru.fiarr4ik.mythicalworld.init.items.custom.CondenserCore;

    public class ItemInit {

        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, Mythicalworld.MOD_ID);

        public static final RegistryObject<Item> CONDENSER_CORE = ITEMS.register("condenser_core",
                () -> new CondenserCore(new Item.Properties()
                        .rarity(Rarity.RARE)
                ));

        public static final RegistryObject<Item> AWAKENING_CONDENSER_CORE = ITEMS.register("awakening_condenser_core",
                () -> new AwakeningCondensingCore(new Item.Properties()
                        .rarity(Rarity.EPIC)
                ));
    }
