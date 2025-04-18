package orangepeel.squidmod100.entities;

import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.entity.animal.MobSquid;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.world.World;
public class MobGlowSquid extends MobSquid{
	public MobGlowSquid(World world) {
		super(world);
		this.textureIdentifier = NamespaceID.getPermanent("squidmod100", "glowsquid");
		this.mobDrops.clear();
		this.mobDrops.add(new WeightedRandomLootObject(Items.DUST_GLOWSTONE.getDefaultStack(), 0, 2));


	}
	public float getBrightness(float partialTick) {
		return 1.0f;
		//if (Global.accessor.isFullbrightEnabled()) {
		//	return 1.0F;
		//} else {
		//	int i = MathHelper.floor(this.x);
		//	double d = (this.bb.maxY - this.bb.minY) * 0.66;
		//	int j = MathHelper.floor(this.y - (double)this.heightOffset + d);
		//	int k = MathHelper.floor(this.z);
		//	if (this.world != null && this.world.areBlocksLoaded(MathHelper.floor(this.bb.minX), MathHelper.floor(this.bb.minY), MathHelper.floor(this.bb.minZ), MathHelper.floor(this.bb.maxX), MathHelper.floor(this.bb.maxY), MathHelper.floor(this.bb.maxZ))) {
		//		float f1 = this.world.getLightBrightness(i, j, k);
		//		if (f1 < this.entityBrightness) {
		//			f1 = this.entityBrightness;
		//		}
//
		//		return f1;
		//	} else {
		//		return this.entityBrightness;
		//	}
		//}
	}
}
