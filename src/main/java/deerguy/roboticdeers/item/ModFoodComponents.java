package deerguy.roboticdeers.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent POTATOBAG = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).build();
    public static final FoodComponent NUTRITIONBAG = new FoodComponent.Builder().nutrition(2).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 0.90f).alwaysEdible().build();
}
