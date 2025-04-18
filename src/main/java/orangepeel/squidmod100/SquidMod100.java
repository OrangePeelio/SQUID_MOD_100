package orangepeel.squidmod100;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.gui.guidebook.mobs.MobInfoRegistry;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import orangepeel.squidmod100.entities.MobGiantSquid;
import orangepeel.squidmod100.entities.SquidEntities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class SquidMod100 implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "squidmod100";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {


		LOGGER.info("SquidMod100 initialized.");
    }

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}

	@Override
	public void beforeGameStart() {
		new SquidEntities().initializeEntities();
	}

	@Override
	public void afterGameStart() {

		MobInfoRegistry.register(MobGiantSquid.class, "giantsquid.name", "giantsquid.desc",
			10, 400, new MobInfoRegistry.MobDrop[]{new MobInfoRegistry.MobDrop(new ItemStack(Items.DYE, 1, 15),
				1.0f, 1, 10)});
	}
}
