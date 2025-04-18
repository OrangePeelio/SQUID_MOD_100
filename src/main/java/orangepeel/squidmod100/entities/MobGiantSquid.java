package orangepeel.squidmod100.entities;

import net.minecraft.client.render.entity.MobRendererSquid;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.animal.MobSquid;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;
public class MobGiantSquid extends MobSquid{
	//private final float tentacleSpeed;

	public MobGiantSquid(World world) {
		super(world);
		this.setSize(5f, 5f);
		//this.tentacleSpeed = 1.0F / (this.random.nextFloat() + 1.0F) * 0.2F;
		this.mobDrops.add(new WeightedRandomLootObject(Items.DYE.getDefaultStack(), 1, 10));
	}
}
