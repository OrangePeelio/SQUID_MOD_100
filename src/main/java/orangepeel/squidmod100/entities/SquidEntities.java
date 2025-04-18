package orangepeel.squidmod100.entities;

import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.EntityHelper;
public class SquidEntities {

	public void initializeEntities() {
		EntityHelper.createEntity(MobGiantSquid.class, NamespaceID.getPermanent("squidmod100", "giantsquid"), "guidebook.section.mob.giantsquid.name");
		EntityHelper.createEntity(MobGlowSquid.class, NamespaceID.getPermanent("squidmod100", "glowsquid"), "guidebook.section.mob.glowsquid.name");
	}
}
