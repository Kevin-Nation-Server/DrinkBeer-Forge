package lekavar.lma.drinkbeer;

import lekavar.lma.drinkbeer.registries.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("drinkbeer")
public class DrinkBeer {
    // We don't need this logger now since there is no need at all.
    // Directly reference a log4j logger.
    // private static final Logger LOGGER = LogManager.getLogger();

    public DrinkBeer() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.ITEMS.register(modEventBus);
        BlockRegistry.BLOCKS.register(modEventBus);
        BlockEntityRegistry.BLOKC_ENTITIES.register(modEventBus);
        SoundEventRegistry.SOUNDS.register(modEventBus);
        MobEffectRegistry.STATUS_EFFECTS.register(modEventBus);
        ContainerTypeRegistry.CONTAINERS.register(modEventBus);
        RecipeRegistry.RECIPE_SERIALIZERS.register(modEventBus);
    }
}
