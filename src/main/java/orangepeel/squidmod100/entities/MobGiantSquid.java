package orangepeel.squidmod100.entities;

import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.entity.animal.MobSquid;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;
public class MobGiantSquid extends MobSquid{

	public MobGiantSquid(World world) {
		super(world);
		this.setSize(3f, 3f);
		this.mobDrops.add(new WeightedRandomLootObject(Items.DYE.getDefaultStack(), 1, 10));
	}
}
