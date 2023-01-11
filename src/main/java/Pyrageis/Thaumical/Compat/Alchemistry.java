package Pyrageis.Thaumical.Compat;
 
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.*;
import thaumcraft.api.aspects.*;
import org.zeith.thaumicadditions.*;
import al132.alchemistry.items.*;



public class Alchemistry {
		  

    // 
    @SubscribeEvent
    public static void registerAspects(AspectRegistryEvent event) {
         
        try {
        	
            AspectRegisterHelper helper = new AspectRegisterHelper(event);

            helper.registerTCObjectTag(ModItems.elements, 1, new AspectList() //Hydrogen
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.LIFE, 1));
						
			 helper.registerTCObjectTag(ModItems.elements, 2, new AspectList() //Helium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.ORDER, 1)
                    .add(Aspect.EARTH, 1));
					
			helper.registerTCObjectTag(ModItems.elements, 3, new AspectList() //Lithium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.ENTROPY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.ENERGY, 1)); //Li-ion batteries
					
			helper.registerTCObjectTag(ModItems.elements, 4, new AspectList() //Beryllium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.EARTH, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.FLIGHT, 1));
					
			helper.registerTCObjectTag(ModItems.elements, 5, new AspectList() //Boron
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.CRYSTAL, 1));
					
					
			helper.registerTCObjectTag(ModItems.elements, 6, new AspectList() //Carbon
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.LIFE, 1)
					.add(Aspect.FIRE, 1));
                    
			helper.registerTCObjectTag(ModItems.elements, 7, new AspectList() //Nitrogen
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.LIFE, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 8, new AspectList() //Oxygen
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.LIFE, 1)
					.add(Aspect.AIR, 1));
					
			helper.registerTCObjectTag(ModItems.elements, 9, new AspectList() //Fluorine
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 2) //toxicity
					.add(Aspect.MOTION, 1)); //part of the name comes from a word for flow
					
			helper.registerTCObjectTag(ModItems.elements, 10, new AspectList() //Neon
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.AIR, 1)
					.add(Aspect.ORDER, 1));
					
			helper.registerTCObjectTag(ModItems.elements, 11, new AspectList() //Sodium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1));
		
			helper.registerTCObjectTag(ModItems.elements, 12, new AspectList() //Magnesium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 13, new AspectList() //Aluminium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.EARTH, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 14, new AspectList() //Silicon
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.CRYSTAL, 1)
					.add(Aspect.MECHANISM, 1)); //commonly used in electronics
			
			helper.registerTCObjectTag(ModItems.elements, 15, new AspectList() //Phosphorus
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.ENTROPY, 1)
					.add(Aspect.LIFE, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 16, new AspectList() //Sulfur
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.CRYSTAL, 1)
					.add(Aspect.FIRE, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 17, new AspectList() //Chlorine
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.ENTROPY, 2)); //extremely reactive
					
			helper.registerTCObjectTag(ModItems.elements, 18, new AspectList() //Argon
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.AIR, 1)
					.add(Aspect.ORDER,1 )); //unergoes few chemical reactions
			
			helper.registerTCObjectTag(ModItems.elements, 19, new AspectList() //Potasium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.LIFE,1 )); 
			
			helper.registerTCObjectTag(ModItems.elements, 20, new AspectList() //Calcium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.UNDEAD,1 )); //bone
			
			helper.registerTCObjectTag(ModItems.elements, 21, new AspectList() //Scandium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 2));
			
			helper.registerTCObjectTag(ModItems.elements, 22, new AspectList() //Titanium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.EARTH, 1));
					
			helper.registerTCObjectTag(ModItems.elements, 23, new AspectList() //Vanadium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 2));
			
			helper.registerTCObjectTag(ModItems.elements, 24, new AspectList() //Chromium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.PROTECT, 1)); //high hardness and corrision resistance
			
			helper.registerTCObjectTag(ModItems.elements, 25, new AspectList() //Manganese
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.PROTECT, 1)); //improves strength in stainless steels
			
			helper.registerTCObjectTag(ModItems.elements, 26, new AspectList() //Iron
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.EARTH, 1)
					.add(Aspect.FIRE, 1)); //makes up a lot of the EARTH's core
			
			helper.registerTCObjectTag(ModItems.elements, 27, new AspectList() //Cobalt
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.ENERGY, 1)); //Commonly used in Li-ion batteries
		
			helper.registerTCObjectTag(ModItems.elements, 28, new AspectList() //Nickel
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.ENERGY, 1) //Ni-CD batteries
					.add(Aspect.DESIRE, 1)); //Commonly used for coins
			
			helper.registerTCObjectTag(ModItems.elements, 29, new AspectList() //Copper
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.CRAFT, 1)); //Building material
			
			helper.registerTCObjectTag(ModItems.elements, 30, new AspectList() //Zinc
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 2));
			
			helper.registerTCObjectTag(ModItems.elements, 31, new AspectList() //Gallium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.ORDER, 1)); //refference point for temperature
			
			helper.registerTCObjectTag(ModItems.elements, 32, new AspectList() //Germanium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.LIGHT, 1)); //used in fiber optic cables LED and other such things involving LIGHT
			
			helper.registerTCObjectTag(ModItems.elements, 33, new AspectList() //Arsenic
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.CRYSTAL, 1)
					.add(Aspect.DEATH, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 34, new AspectList() //Selenium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.CRYSTAL, 2)); //used in making glass
			
			helper.registerTCObjectTag(ModItems.elements, 35, new AspectList() //Bromine
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.ENTROPY, 2));
					
			helper.registerTCObjectTag(ModItems.elements, 36, new AspectList() //Krypton
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.AIR, 1)
					.add(Aspect.LIGHT, 1)); //Used in LIGHTing
			
			helper.registerTCObjectTag(ModItems.elements, 37, new AspectList() //Rubidium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 2));
					
			helper.registerTCObjectTag(ModItems.elements, 38, new AspectList() //Strontium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.EARTH, 1)
					.add(Aspect.METAL, 1)); 

			helper.registerTCObjectTag(ModItems.elements, 39, new AspectList() //Yttrium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1)
					.add(Aspect.LIGHT, 1)); //I cant be bothered to provide more explanations, just read the wikipedia pages
			
			helper.registerTCObjectTag(ModItems.elements, 40, new AspectList() //Zirconium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.CRYSTAL, 1)
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 41, new AspectList() //Niobium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.PROTECT, 1)
					.add(Aspect.METAL, 1)); 
		
			helper.registerTCObjectTag(ModItems.elements, 42, new AspectList() //Molybdenum
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.PROTECT, 1)
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 43, new AspectList() //Technetium
					.add(Aspect.ALCHEMY, 1)
					//.add(Aspect.DESTRUCTION, 1) commented until I figure out how to use thaumic additions Aspects
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 44, new AspectList() //Ruthenium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.PROTECT, 1)
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 45, new AspectList() //Rhodium
					.add(Aspect.ALCHEMY, 2)
					.add(Aspect.CRYSTAL, 1));
					
			helper.registerTCObjectTag(ModItems.elements, 46, new AspectList() //Palladium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.EXCHANGE, 1)
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 47, new AspectList() //Silver
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DESIRE, 1)
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 48, new AspectList() //Cadmium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.ENERGY, 1) //Ni-CD batteries
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 49, new AspectList() //Indium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.ENERGY, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 50, new AspectList() //Tin
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.MECHANISM, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 51, new AspectList() //Antimony
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.MECHANISM, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 52, new AspectList() //Tellurium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.MECHANISM, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 53, new AspectList() //Iodine
					.add(Aspect.ALCHEMY, 2));
					//.add(Aspect.WAVE, 1)); commented until I figure out how to use thaumic additions Aspects
			
			helper.registerTCObjectTag(ModItems.elements, 54, new AspectList() //Xenon
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.AIR, 1) 
					.add(Aspect.LIGHT, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 55, new AspectList() //Caesium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.METAL, 1) );
					//.add(Aspect.DESTRUCTION, 1)); commented until I figure out how to use thaumic additions Aspects
			
			helper.registerTCObjectTag(ModItems.elements, 56, new AspectList() //Barium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.VOID, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 57, new AspectList() //Lanthanum
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.EARTH, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 58, new AspectList() //Cerium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.FIRE, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 59, new AspectList() //Praseodymium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.EARTH, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 60, new AspectList() //Neodymium
					.add(Aspect.ALCHEMY, 1)
					//.add(Aspect.SOUND, 1) commented until I figure out how to use thaumic additions Aspects
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 61, new AspectList() //Promethium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.FIRE, 1) 
					.add(Aspect.MIND, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 62, new AspectList() //Samarium
					.add(Aspect.ALCHEMY, 1)
					//.add(Aspect.WAVE, 1) commented until I figure out how to use thaumic additions Aspects
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 63, new AspectList() //Europium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.LIGHT, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 64, new AspectList() //Gadolinium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.PROTECT, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 65, new AspectList() //Terbium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.LIGHT, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 66, new AspectList() //Dysprosium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.MECHANISM, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 67, new AspectList() //Holium
					.add(Aspect.ALCHEMY, 1)
					//.add(Aspect.WAVE, 1) commented until I figure out how to use thaumic additions Aspects
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 68, new AspectList() //Erbium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.LIFE, 1) 
					.add(Aspect.LIGHT, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 69, new AspectList() //Thulium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.MECHANISM, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 70, new AspectList() //Ytterbium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.FIRE, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 71, new AspectList() //Lutetium
					.add(Aspect.ALCHEMY, 2) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 72, new AspectList() //Hafnium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.MECHANISM, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 73, new AspectList() //Tantalum
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.PROTECT, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 74, new AspectList() //Tungsten
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.AVERSION, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 75, new AspectList() //Rhenium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.MECHANISM, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 76, new AspectList() //Osmium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.PROTECT, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 77, new AspectList() //Iridium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.ELDRITCH, 1)  //End is linked to this and its found in meteors a lot so...
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 78, new AspectList() //Platinum
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DESIRE, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 79, new AspectList() //Gold
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DESIRE, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 80, new AspectList() //Mercury
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1) 
					.add(Aspect.METAL, 1)); 
			
			helper.registerTCObjectTag(ModItems.elements, 81, new AspectList() //Thallium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1) 
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 82, new AspectList() //Lead
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1) 
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 83, new AspectList() //Bismuth
					.add(Aspect.ALCHEMY, 1) 
					.add(Aspect.METAL, 2));
			
			helper.registerTCObjectTag(ModItems.elements, 84, new AspectList() //Polonium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 85, new AspectList() //Astatine
					.add(Aspect.ALCHEMY, 3)
					.add(Aspect.DEATH, 2));
			
			helper.registerTCObjectTag(ModItems.elements, 86, new AspectList() //Radon
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 2)
					.add(Aspect.AIR, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 87, new AspectList() //Francium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 2)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 88, new AspectList() //Radium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1)
					.add(Aspect.LIGHT, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 89, new AspectList() //Actinium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 90, new AspectList() //Thorium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1)
					.add(Aspect.PROTECT, 2)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 91, new AspectList() //Protactinium
					.add(Aspect.ALCHEMY, 3)
					.add(Aspect.DEATH, 4)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 92, new AspectList() //Uranium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 93, new AspectList() //Neptunium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 1)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 94, new AspectList() //Plutonium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 6)
					.add(Aspect.ENTROPY, 2)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 95, new AspectList() //Polonium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 96, new AspectList() //Curium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 97, new AspectList() //Berkelium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 98, new AspectList() //Californium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 1)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 99, new AspectList() //Einsteinium
					.add(Aspect.ALCHEMY, 1)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 100, new AspectList() //Fermium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 101, new AspectList() //Mandelevium
					.add(Aspect.ALCHEMY, 2)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 102, new AspectList() //Nobelium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 2)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 103, new AspectList() //Lawrencium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 2)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 104, new AspectList() //Rutherfordium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 2)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 105, new AspectList() //Dubnium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 2)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 106, new AspectList() //Seaborgium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 2)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 107, new AspectList() //Bohrium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 108, new AspectList() //Hassium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 5)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 109, new AspectList() //Meitnerium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 5)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 110, new AspectList() //Darmstadtium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 111, new AspectList() //Roentgenium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 112, new AspectList() //Copernicium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 5)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 113, new AspectList() //Nihonium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 114, new AspectList() //Flerovium
					.add(Aspect.ALCHEMY, 5)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 115, new AspectList() //Moscovium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 116, new AspectList() //Livermorium
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 117, new AspectList() //Tennessine
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.METAL, 1));
			
			helper.registerTCObjectTag(ModItems.elements, 118, new AspectList() //Oganesson
					.add(Aspect.ALCHEMY, 4)
					.add(Aspect.DEATH, 4)
					.add(Aspect.ENERGY, 1)
					.add(Aspect.AIR, 1));

        } catch (Exception e) {
        	
        }
    }
    
    public static class AspectRegisterHelper {

        public final AspectRegistryEvent event;

        public AspectRegisterHelper(AspectRegistryEvent event) {
            this.event = event;
        }

        public void registerTCObjectTag(Block block, AspectList list) {
            registerTCObjectTag(new ItemStack(block), list);
        }

        // Register a block with Thaumcraft aspects
        public void registerTCObjectTag(Block block, int meta, AspectList list) {
            if (meta == -1) meta = OreDictionary.WILDCARD_VALUE;
            registerTCObjectTag(new ItemStack(block, 1, meta), list);
        }

        // Register blocks with Thaumcraft aspects
        public void registerTCObjectTag(Block block, int[] metas, AspectList list) {
            for (int meta : metas)
                this.registerTCObjectTag(block, meta, list);
        }

        public void registerTCObjectTag(Item item, AspectList list) {
            registerTCObjectTag(new ItemStack(item), list);
        }

        // Register an item with Thaumcraft aspects
        public void registerTCObjectTag(Item item, int meta, AspectList list) {
            if (meta == -1) meta = OreDictionary.WILDCARD_VALUE;
            registerTCObjectTag(new ItemStack(item, 1, meta), list);
        }

        // Register item swith Thaumcraft aspects
        public void registerTCObjectTag(Item item, int[] metas, AspectList list) {
            for (int meta : metas)
                this.registerTCObjectTag(item, meta, list);
        }

        public void registerTCObjectTag(ItemStack stack, AspectList list) {
            event.register.registerObjectTag(stack, list);
        }
    }
}