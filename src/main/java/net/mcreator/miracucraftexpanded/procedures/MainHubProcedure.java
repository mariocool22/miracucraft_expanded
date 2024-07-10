package net.mcreator.miracucraftexpanded.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.miracucraftexpanded.item.BugnoirItem;
import net.mcreator.miracucraftexpanded.MiracucraftExpandedMod;

import java.util.Map;
import java.util.HashMap;

public class MainHubProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onChat(ServerChatEvent event) {
			ServerPlayerEntity entity = event.getPlayer();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("text", event.getMessage());
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MiracucraftExpandedMod.LOGGER.warn("Failed to load dependency entity for procedure MainHub!");
			return;
		}
		if (dependencies.get("text") == null) {
			if (!dependencies.containsKey("text"))
				MiracucraftExpandedMod.LOGGER.warn("Failed to load dependency text for procedure MainHub!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		String text = (String) dependencies.get("text");
		if ((text).contains("Tikki, Plagg, Unify!")) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"function miracucraft_expanded:bugnoiretransform");
				}
			}
		} else if ((text).contains("Spots and Claws Away")) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"function miracucraft_expanded:bugnoiredivide");
				}
			}
		} else if ((text).contains("Tikki, Pollen, Unify!")) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"function miracucraft_expanded:ladybeeunify");
				}
			}
		} else if ((text).contains("Divide")) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"function miracucraft_expanded:ladybeedivide");
				}
			}
		} else if ((text).contains("Cataclysm!")) {
			if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BugnoirItem.helmet)) : false) {
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "give @s alucardmiracucraft:cataclism");
					}
				}
			}
		}
	}
}
