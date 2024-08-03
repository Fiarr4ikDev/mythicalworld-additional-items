package ru.fiarr4ik.mythicalworld;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.fiarr4ik.mythicalworld.init.items.ItemInit;

    @Mod(Mythicalworld.MOD_ID)
    public class Mythicalworld {

        private static final Logger LOGGER = LogManager.getLogger();
        public static final String MOD_ID = "mythicalworld";

        public Mythicalworld() {

            final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

            ItemInit.ITEMS.register(modEventBus);

            MinecraftForge.EVENT_BUS.register(this);
        }

    }

