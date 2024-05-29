execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run tag @s remove UnifyPerms
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run execute at @s run playsound alucardmiracucraft:detransformation_sound master @a[distance=..7]
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run clear @s alucardmiracucraft:yo_yo_ring
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run clear @s alucardmiracucraft:bee_spinning_top
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run execute at @s run summon alucardmiracucraft:tikki
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run execute at @s run summon alucardmiracucraft:pollen
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run give @s alucardmiracucraft:bee_miraculous_queen_bee
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run give @s alucardmiracucraft:ladybug_miraculous_1
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run team remove Ladybee
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run replaceitem entity @s armor.chest minecraft:air
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run replaceitem entity @s armor.feet minecraft:air
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miraculous_fanmade_suits:lady_bee_helmet"}]}] run replaceitem entity @s armor.head minecraft:air