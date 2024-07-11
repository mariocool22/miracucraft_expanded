execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run tag @s remove UnifyPerms
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run execute at @s run playsound alucardmiracucraft:detransformation_sound master @a[distance=..7]
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run execute at @s run summon alucardmiracucraft:tikki
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run execute at @s run summon alucardmiracucraft:pollen
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run give @s alucardmiracucraft:bee_miraculous_queen_bee
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run give @s alucardmiracucraft:ladybug_miraculous_1
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run team remove Ladybee
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run effect clear @s alucardmiracucraft:power_action
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run effect clear @s alucardmiracucraft:creation_power
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run replaceitem entity @s armor.legs minecraft:air
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run replaceitem entity @s armor.chest minecraft:air
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run replaceitem entity @s armor.feet minecraft:air
execute as @e[sort=nearest,limit=1] run execute as @s[nbt={Inventory:[{id:"miracucraft_expanded:ladybee_helmet"}]}] run replaceitem entity @s armor.head minecraft:air