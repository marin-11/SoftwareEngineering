public class VirtualPet {
    
        private String name;
        //0 (not hungry) to 10 (very hungry)
        private int hunger;
        //0 (sad) to 10 (very happy)
        private int happiness;

        public VirtualPet(String name){
            this.name = name;
            this.hunger = 5;
            this.happiness = 5;
        }

        public void feed(){
            if(hunger == 1 || hunger == 0){
                hunger = 0;
            }
            else{
                hunger -= 2;
            }
        }

        public void play(){
            if(happiness == 10){
                System.out.println("Your pet is already at max happiness!");
            }
            else{
                happiness += 2;
                hunger += 1;
            }
        }

        public void passTime(){
            if(hunger == 0 || happiness == 0){
                System.out.println("Your pet needs to be taken care of!");
            }
            else{
                hunger += 1;
                happiness -= 1;
            }
        }

        public String toString(){
            return "Your pet: " + name + " has: " + hunger + " and: " + happiness + "happiness";
        }
    }
