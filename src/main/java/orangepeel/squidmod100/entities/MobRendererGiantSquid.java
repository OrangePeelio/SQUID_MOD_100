package orangepeel.squidmod100.entities;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.MobRenderer;
import net.minecraft.client.render.entity.MobRendererSquid;
import net.minecraft.client.render.model.ModelBase;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.entity.animal.MobSquid;
import org.lwjgl.opengl.GL11;

@Environment(EnvType.CLIENT)
public class MobRendererGiantSquid extends MobRenderer<MobGiantSquid> {
	public MobRendererGiantSquid(ModelBase modelbase, float f) {
		super(modelbase, f);
	}
	protected void setupScale(MobGiantSquid entity, float f) {
		GL11.glScalef(5f, 5f, 5f);
	}

	protected float limbSway(MobGiantSquid squid, float partialTick) {
		return squid.oldTentacleAngle + (squid.tentacleAngle - squid.oldTentacleAngle) * partialTick;
	}

	protected void setupRotations(MobGiantSquid squid, float ticksExisted, float bodyYaw, float partialTick) {
		if (squid.isSpecial()) {
			super.setupRotations(squid, ticksExisted, bodyYaw, partialTick);
		} else {
			float pitch = squid.xBodyRotO + (squid.xBodyRot - squid.xBodyRotO) * partialTick;
			float yaw = squid.zBodyRotO + (squid.zBodyRot - squid.zBodyRotO) * partialTick;
			GL11.glTranslatef(0.0F, 0.5F, 0.0F);
			GL11.glRotatef(180.0F - bodyYaw, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(pitch, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(yaw, 0.0F, 1.0F, 0.0F);
			GL11.glTranslatef(0.0F, -1.2F, 0.0F);
		}

	}

	public void renderPreview(Tessellator tessellator, MobGiantSquid squid, double x, double y, double z, float yaw, float partialTick) {
		GL11.glPushMatrix();
		GL11.glTranslatef(0.0F, 1.25F, 0.0F);
		super.renderPreview(tessellator, squid, x, y, z, yaw, partialTick);
		GL11.glPopMatrix();
	}

}
