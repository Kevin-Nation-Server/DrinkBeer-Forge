package lekavar.lma.drinkbeer;

import lekavar.lma.drinkbeer.client.DrinkBeerClient;
import lekavar.lma.drinkbeer.networking.NetWorking;
import lekavar.lma.drinkbeer.registries.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("drinkbeer")
public class DrinkBeer {
    // We don't need this logger now since there is no need at all.
    // Directly reference a log4j logger.
    // private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "drinkbeer";

    public DrinkBeer() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MobEffectRegistry.STATUS_EFFECTS.register(bus);
        ItemRegistry.ITEMS.register(bus);
        BlockRegistry.BLOCKS.register(bus);
        BlockEntityRegistry.BLOCK_ENTITIES.register(bus);
        SoundEventRegistry.SOUNDS.register(bus);
        ContainerTypeRegistry.CONTAINERS.register(bus);
        RecipeRegistry.RECIPE_TYPES.register(bus);
        RecipeRegistry.RECIPE_SERIALIZERS.register(bus);
        ParticleRegistry.PARTICLES.register(bus);

        bus.addListener(DrinkBeerClient::onInitializeClient);
        bus.addListener(NetWorking::init);
    }
}
