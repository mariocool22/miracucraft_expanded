team add AkumaVillain
team modify AkumaVillain nametagVisibility never
team modify AkumaVillain color dark_purple
team join AkumaVillain @s
execute as @a[team=AkumaVillain] run clear @s alucardmiracucraft:akuma_mask
execute as @a[team=AkumaVillain] run scale reset @s
execute at @a[team=AkumaVillain] run particle alucardmiracucraft:akumatized_particle ~ ~1 ~
execute at @a[team=AkumaVillain] run particle alucardmiracucraft:akumatized_particle ~ ~ ~
execute at @a[team=AkumaVillain] run particle alucardmiracucraft:akumatized_particle ~ ~0.5 ~
execute at @a[team=AkumaVillain] run particle alucardmiracucraft:akumatized_particle ~ ~1.5 ~
tag @a[team=AkumaVillain] add Truth
replaceitem entity @a[team=AkumaVillain] armor.head miraculousrpitem:truth_helmet{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
replaceitem entity @a[team=AkumaVillain] armor.chest miraculousrpitem:truth_chestplate{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
replaceitem entity @a[team=AkumaVillain] armor.legs minecraft:air
replaceitem entity @a[team=AkumaVillain] armor.feet miraculousrpitem:truth_boots{Enchantments:[{id:binding_curse,lvl:1},{id:"minecraft:unbreaking",lvl:3s},{id:"minecraft:vanishing_curse",lvl:1s}],Unbreakable:1}
