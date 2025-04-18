package orangepeel.squidmod100.mixin;


import net.minecraft.core.entity.SpawnListEntry;
import net.minecraft.core.world.biome.Biome;
import orangepeel.squidmod100.entities.MobGiantSquid;
import orangepeel.squidmod100.entities.MobGlowSquid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(value = Biome.class, remap = false)
public class BiomeMixin {

	@Shadow
	protected List<SpawnListEntry> spawnableWaterCreatureList;

	@Inject(method = "<init>", at = @At("TAIL"))
	private void addSquids(String key, CallbackInfo ci) {
		this.spawnableWaterCreatureList.add(new SpawnListEntry(MobGiantSquid.class, 2));
		this.spawnableWaterCreatureList.add(new SpawnListEntry(MobGlowSquid.class, 2));
	}

}
