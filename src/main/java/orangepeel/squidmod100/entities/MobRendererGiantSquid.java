package orangepeel.squidmod100.entities;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.MobRendererSquid;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.core.entity.animal.MobSquid;
import org.lwjgl.opengl.GL11;

@Environment(EnvType.CLIENT)
public class MobRendererGiantSquid extends MobRendererSquid{
	public MobRendererGiantSquid(ModelBase modelbase, float f) {
		super(modelbase, f);
	}
	protected void setupScale(MobSquid entity, float f) {
		GL11.glScalef(3f, 3f, 3f);
	}


}
