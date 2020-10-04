public class MovieComputation{
        private int age;
        private String bloodType;
        private String denialOfUse;
        private String donationGroups;
        
        //create constructor
        public MovieComputation(){
        
        }
        
        //setters & getters
        public void setAge(int age) {
            this.age = age;
        }
        
        
        public void setBloodType(String bloodType) {
            this.bloodType = bloodType;
        }
        
        public void bloodDonationGroup(){
            //String donationGroups = " ";
            //process & output
                if(age < 18){
                   // donationGroups=("Sorry, you cannot donate if you are under 18.");
                    denialOfUse=("Sorry, you cannot donate if you are under 18.");
                   // donationGroups=("Sorry, you cannot donate if you are under 18.");
        
                   // System.out.println(denialOfUse);
        
                }else if(age >= 18){
                    //System.out.println("Enter your blood type:");
                    //bloodTypePrompt = ("Enter your blood type:");
                    if(bloodType.equalsIgnoreCase("AB"))
                    {
                        donationGroups="You can donate to blood group(s): AB and can recieve from AB, A, B, O.";
                    }
                    else if(bloodType.equalsIgnoreCase("A")){
                        donationGroups=("You can donate to blood group(s): A and AB and can recieve from A and O.");
                    }
                    else if(bloodType.equalsIgnoreCase("B"))
                    {
                        donationGroups=("You can donate to blood group(s): B and AB and can recieve from B and O.");
                    }
                    else if(bloodType.equalsIgnoreCase("O"))
                    {
                        donationGroups=("You can donate to blood group(s): AB, A, B, and O and can recieve from O.");
                    }
                    else
                    {
                        donationGroups = ("Error");
                    }
                }
                //getter 
            }
            
        public int getAge() {
            return this.age;
        }
        
        public String getDenialOfUse() {
            return this.denialOfUse;
        }
        
        public String getBloodType() {
            return this.bloodType;
        }
        
        public String getDonationGroups() {
            return this.donationGroups;
        }
        
        }