execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:bee_miraculous_queen_bee"}]}] run tag @s add CanLadybee
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:bee_miraculous_ancient"}]}] run tag @s add CanLadybee
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:bee_miraculous_vesperia"}]}] run tag @s add CanLadybee
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:bee_miraculous_king_bee"}]}] run tag @s add CanLadybee
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"alucardmiracucraft:ladybug_helmet"}]}] run execute as @s[tag=CanLadybee] run tag @s add LadybeeTransforming
execute as @e[tag=LadybeeTransforming] run replaceitem entity @s armor.head miracucraft_expanded:ladybee_helmet{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
execute as @e[tag=LadybeeTransforming] run replaceitem entity @s armor.chest miracucraft_expanded:ladybee_chestplate{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
execute as @e[tag=LadybeeTransforming] run replaceitem entity @s armor.legs miracucraft_expanded:ladybee_leggings{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
execute as @e[tag=LadybeeTransforming] run replaceitem entity @s armor.feet miracucraft_expanded:ladybee_boots{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
execute as @e[tag=LadybeeTransforming] run clear @s alucardmiracucraft:yo_yo
execute as @e[tag=LadybeeTransforming] run give @s alucardmiracucraft:yo_yo_ring
execute as @e[tag=LadybeeTransforming] run tag @s add UnifyPerms
execute as @e[tag=LadybeeTransforming] run kill @e[type=alucardmiracucraft:pollen]
execute as @e[tag=LadybeeTransforming] run give @s alucardmiracucraft:bee_spinning_top
execute as @e[tag=LadybeeTransforming] run scoreboard players set @s LadybugHolder 2
execute as @e[tag=LadybeeTransforming] run scoreboard players set @s BeeHolder 2
execute as @e[tag=LadybeeTransforming] run clear @s alucardmiracucraft:bee_miraculous_queen_bee
execute as @e[tag=LadybeeTransforming] run clear @s alucardmiracucraft:bee_miraculous_ancient
execute as @e[tag=LadybeeTransforming] run clear @s alucardmiracucraft:bee_miraculous_vesperia
execute as @e[tag=LadybeeTransforming] run clear @s alucardmiracucraft:bee_miraculous_king_bee
execute as @e[tag=LadybeeTransforming] run team add LadyBee
execute as @e[tag=LadybeeTransforming] run team modify LadyBee nametagVisibility never
execute as @e[tag=LadybeeTransforming] run team modify Ladybee color yellow
execute as @e[tag=LadybeeTransforming] run team join Ladybee @s
execute as @e[tag=LadybeeTransforming] run effect give @s minecraft:glowing 2 2 true
execute as @e[tag=LadybeeTransforming] run execute at @s run playsound alucardmiracucraft:bee_transform master @a[distance=..7]
execute as @e[tag=LadybeeTransforming] run effect give @s alucardmiracucraft:creation_power 999999 1 true
execute as @e[tag=LadybeeTransforming] run effect give @s alucardmiracucraft:power_action 999999 1 true
tag @e remove LadybeeTransforming
tag @e remove CanLadybee