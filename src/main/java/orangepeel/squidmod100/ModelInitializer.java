package orangepeel.squidmod100;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.model.ModelSquid;
import orangepeel.squidmod100.entities.MobGiantSquid;
import orangepeel.squidmod100.entities.MobGlowSquid;
import orangepeel.squidmod100.entities.MobRendererGiantSquid;
import orangepeel.squidmod100.entities.MobRendererGlowSquid;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

@Environment(EnvType.CLIENT)
public class ModelInitializer implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {

	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {
		ModelHelper.setEntityModel(MobGiantSquid.class, () -> new MobRendererGiantSquid(new ModelSquid(), .3f));
		ModelHelper.setEntityModel(MobGlowSquid.class, () -> new MobRendererGlowSquid(new ModelSquid(), .3f));
	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}

}
