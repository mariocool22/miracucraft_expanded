package net.mcreator.miracucraftexpanded.procedures;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.miracucraftexpanded.MiracucraftExpandedMod;

import java.util.Map;

public class WindDragonEffectExpiresProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MiracucraftExpandedMod.LOGGER.warn("Failed to load dependency entity for procedure WindDragonEffectExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.SURVIVAL);
	}
}
