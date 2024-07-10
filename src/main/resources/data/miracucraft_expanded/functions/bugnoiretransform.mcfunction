execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:cat_mirac_white"}]}] run tag @s add CanCatBNoir
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:cat_mirac_pink"}]}] run tag @s add CanCatBNoir
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:cat_mirac_ancient"}]}] run tag @s add CanCatBNoir
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:cat_miraculous_walker"}]}] run tag @s add CanCatBNoir
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:cat_miraculous_zoe"}]}] run tag @s add CanCatBNoir
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:ladybug_helmet"}]}] run execute as @s[tag=CanCatBNoir] run tag @s add BugnTransforming
execute as @e[tag=BugnTransforming] run replaceitem entity @s armor.head miracucraft_expanded:bugnoir_helmet{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
execute as @e[tag=BugnTransforming] run replaceitem entity @s armor.chest miracucraft_expanded:bugnoir_chestplate{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
execute as @e[tag=BugnTransforming] run replaceitem entity @s armor.legs miracucraft_expanded:bugnoir_leggings{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
execute as @e[tag=BugnTransforming] run replaceitem entity @s armor.feet miracucraft_expanded:bugnoir_boots{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
execute as @e[tag=BugnTransforming] run clear @s alucardmiracucraft:yo_yo
execute as @e[tag=BugnTransforming] run give @s alucardmiracucraft:yo_yo_ring
execute as @e[tag=BugnTransforming] run tag @s add UnifyPerms
execute as @e[tag=BugnTransforming] run kill @e[type=alucardmiracucraft:plagg]
execute as @e[tag=BugnTransforming] run give @s alucardmiracucraft:cat_staff_1
execute as @e[tag=BugnTransforming] run scoreboard players set @s LadybugHolder 2
execute as @e[tag=BugnTransforming] run scoreboard players set @s CatHolder 2
execute as @e[tag=BugnTransforming] run clear @s alucardmiracucraft:cat_mirac_white
execute as @e[tag=BugnTransforming] run clear @s alucardmiracucraft:cat_mirac_pink
execute as @e[tag=BugnTransforming] run clear @s alucardmiracucraft:cat_mirac_ancient
execute as @e[tag=BugnTransforming] run clear @s alucardmiracucraft:cat_miraculous_walker
execute as @e[tag=BugnTransforming] run clear @s alucardmiracucraft:cat_miraculous_zoe
execute as @e[tag=BugnTransforming] run team add BugNoire
execute as @e[tag=BugnTransforming] run team modify BugNoire nametagVisibility never
execute as @e[tag=BugnTransforming] run team modify BugNoire color red
execute as @e[tag=BugnTransforming] run team join BugNoire @s
execute as @e[tag=BugnTransforming] run effect give @s minecraft:glowing 2 2 true
execute as @e[tag=BugnTransforming] run execute at @s run playsound alucardmiracucraft:cat_transf master @a[distance=..7]
execute as @e[tag=BugnTransforming] run effect give @s alucardmiracucraft:creation_power 999999 1 true
tag @e remove BugnTransforming
tag @e remove CanCatBNoir