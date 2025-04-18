package orangepeel.squidmod100.entities;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.MobRendererSquid;
import net.minecraft.client.render.model.ModelBase;

@Environment(EnvType.CLIENT)
public class MobRendererGlowSquid extends MobRendererSquid{
	public MobRendererGlowSquid(ModelBase modelbase, float f) {
		super(modelbase, f);
	}

}
