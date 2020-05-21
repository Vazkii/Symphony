package vazkii.symphony;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Symphony.MOD_ID)
public class Symphony {
	
	public static final String MOD_ID = "symphony";

	public Symphony() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
	}
	
	public void setup(FMLClientSetupEvent event) {
		System.out.println("loaded");
	}
}
