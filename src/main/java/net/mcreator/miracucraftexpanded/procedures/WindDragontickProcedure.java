package net.mcreator.miracucraftexpanded.procedures;

import net.minecraftforge.eventbus.api.Event;

public class WindDragontickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MiracucraftExpandedMod.LOGGER.warn("Failed to load dependency world for procedure WindDragontick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MiracucraftExpandedMod.LOGGER.warn("Failed to load dependency x for procedure WindDragontick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MiracucraftExpandedMod.LOGGER.warn("Failed to load dependency y for procedure WindDragontick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MiracucraftExpandedMod.LOGGER.warn("Failed to load dependency z for procedure WindDragontick!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");

		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double zz = 0;
		double yy = 0;
		double xx = 0;
		double Schet = 0;
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.SMOKE, x, y, z, (int) 150, 3, 3, 3, 1);
		}
	}

}
