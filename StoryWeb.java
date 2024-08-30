import java.util.*;
import java.io.*;
import java.lang.*;

public class StoryWeb{
	
	/*////////////////////////////////////////////////////////////////
	1 Choose genre
	2	print beginning of story
	3		ask user a choice
	4			print section of story based on choices (2/3x)
	5				print end of story
	6					ask want to continue
	*/////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) throws IOException{
				
		Scanner userInput = new Scanner(System.in);		
		
		System.out.print("\nHELLO! \n\nMy hobby is writing!");
		System.out.print("\nI function to imitate my favorite writers..");
		System.out.print("\nLike Aristotle proposed every story has a beginning, middle, & end.");
		System.out.println("\n\n **** My Object is to mimic human choice with your teamwork, via electronic Media, in a fictional Mode **** \n\n");
		System.out.println("\nPlease join me and write a story!");
	
		String proceed = "";
	
		do{	
		   System.out.println("\n\nHmmm help me choose... \n\n(A) Action \n(D) Drama \n(R) Romance \n(S) SciFi \n(T) Thriller\n\n");		
 
		   String genre = userInput.nextLine();

			if(genre.equalsIgnoreCase("A")){
				System.out.println("Lets get the adrenaline flowing!");
				
					if(genre.equalsIgnoreCase("A")){  // BEGINNING
						System.out.println("\n You infiltrated the smuggling group as a gun for hire tonight.");
						System.out.println("\n The leader took a liking to you and introduces you to everyone.");
						System.out.println("\n One of the members, Z, always keeps an eye on you.");
						System.out.println("\n You remember his face, you went to middle school together.");
						System.out.println("\n Z approaches you and asks why you look so familiar...");
						
						System.out.println("\n Do you want to: \n (x) Tell him why you look familiar \n (y) Lie and keep calm");

						String choiceA = userInput.nextLine();
						
							if(choiceA.equalsIgnoreCase("x")){ //MIDDLE x TELL HIM
								System.out.println("\nYou tell Z how you both know eachother from many years ago.");
								System.out.println("\nIt takes him a moment before he finally recognizes you.");
								System.out.println("\nHe smiles and shakes your hand. Then slowly walks outside.");
								System.out.println("\nZ Googles the name he remembers you as and sees your cadet police officer graduation photos.");
								System.out.println("\nOut of nowhere gunshots start flying over your head! One hits your arm!");
						
								System.out.println("\n\nDo you want to: \n (x) RUN \n (y) GUN");
								
								String choiceB = userInput.nextLine();
								
										if(choiceB.equalsIgnoreCase("x")){ // END x1 TELL HIM | RUN
											System.out.println("\nYou quickly fire defensive shots, jump out of the nearest window, & drop a smoke grenade!");
											System.out.println("\nIt saved you some time but theyre closely behind you and the dogs are gaining on you!");
											System.out.println("\nMore and more shots are being fired at you as you radio back up!");
											System.out.println("\nYou jump into the truck and ghost ride it into the propane tanks by the building!");
											System.out.println("\n Massive flame and lights fill the sky, back up arrived, and you smirk at Z, as hes being arrested...");

										}
										if(choiceB.equalsIgnoreCase("y")){ // END x2 TELL HIM | GUN
											System.out.println("\n You quickly drop a smoke bomb, sprint across the room, as you pull out two pistols & fire back!");
											System.out.println("\n You tuck and roll behind a barrier and reload your weapons as you ping back up!");
											System.out.println("\n One of the henchmen sneaks from behind and you engage in hand to hand combat then put him to sleep!");
											System.out.println("\n The helicopter lights and back up approach...Z fires a missle that brought the roof down with you.");
											System.out.println("\n You barely make it out of the rubble alive as paramedics come to assist you...Z smirks at you as hes being arrested.");
										}
							}
							else if(choiceA.equalsIgnoreCase("y")){ // MIDDLE Y LIE
								System.out.println("\n You say youre not sure, maybe you just have one of those faces.");
								System.out.println("\n You tell him we have more important things to worry about, lets prepare.");
								System.out.println("\n The team loads the truck and heads out for the job.");
								System.out.println("\n A local on duty police officers pulls over the line of trucks.");
								System.out.println("\n The team panics as the cop approaches your side of the truck. You try to gesture the cop away.");
								System.out.println("\n All of a sudden one of the panicked men starts unloading at the officers partner and car!");
								
								System.out.println("\n\nDo you want to: \n (x) Keep cover \n (y) Assist");
								
								String choiceB = userInput.nextLine();
								
										if(choiceB.equalsIgnoreCase("x")){ // END Y1 LIE | KEEP COVER
											System.out.println("\n You scream and slam on the gas! Secretly trying to help the officer by getting the team away!");
											System.out.println("\n As youre speeding you silently unclip a grenade then ghost ride the truck!");
											System.out.println("\n You tuck and roll then hide in the bushes as the truck rolls off in flames!");
											System.out.println("\n The other truck with Z speed towards the flaming truck & covertly shoot the tires.");
											System.out.println("\n You make a direct hit and the truck skids then flips across the street!");
											System.out.println("\n Z is arrested then put in an ambulance...you wink at Z as it drives off and he remembers your 13 year old face.");
										}
										if(choiceB.equalsIgnoreCase("y")){ // END Y2 LIE | ASSIST
											System.out.println("\n You quickly speed into reverse to violently slam the team truck behind you and throw them off!");
											System.out.println("\n You wrestle the gun out of the passengers hand and shoot him!");
											System.out.println("\n You move the truck in front of the officers car to shield him & tell him youre undercover!");
											System.out.println("\n Z comes back to consciousness & sees youre a traitor!");
											System.out.println("\n He rolls a grenade under your truck & it explodes sending you flying.");
											System.out.println("\n You wake up to EMT assiting you & Z in cuffs. As the ambulance drives off, Z winks at you remembering your 13 year old face.");
										}	
							}			
					}		
					System.out.println("\n\nGreat story!\n");							
			}						
	
			if(genre.equalsIgnoreCase("D")){
				System.out.println("Okay, lets not get too dramatic...");
				
				if(genre.equalsIgnoreCase("D")){  // BEGINNING
						System.out.println("\n You walk thorugh the door...the puppy jumped off the couch excitedly wagging its tail and jumping for a hug.");
						System.out.println("\n Youre confused but cant help but play with and pet the pup!");
						System.out.println("\n You call your significant other & wonder whats going on...");

						System.out.println("\n\n Do you want to: \n (x) Call and be upset \n (y) Call and be calm");

						String choiceA = userInput.nextLine();
						
							if(choiceA.equalsIgnoreCase("x")){ //MIDDLE X
								System.out.println("\n Youre respectful but upset because you didnt talk about this new responsibility together.");
								System.out.println("\n We both dont have the time and I dont want to clean after the pup...so much poop!");
						    System.out.println("\n I dont want this...we cant have a pup here...no exceptions - I'm getting it out of the house right now."); 
								
								System.out.println("\n\nDo you want to: \n (x) Immediately send the pup back   \n (y) Play with the pup a few more minutes ");
								
								String choiceB = userInput.nextLine();
								
										if(choiceB.equalsIgnoreCase("x")){ // END X1
											System.out.println("\n You try to grab the pup but it runs around playfully.");
											System.out.println("\n You finally catch the pup & it nuzzles into your arms...you make pretend you dont care.");
											System.out.println("\n As you grab your keys to walk out the door the cute puppy's eye look at you with sadness & you cant do it...you become best friends.");											
										}
										if(choiceB.equalsIgnoreCase("y")){ // END X2
											System.out.println("\n You play with the puppy a few minutes before looking up a dog pound. ");
											System.out.println("\n Its a little bit more fun than you expected...you didnt even notice how much time passed.");
											System.out.println("\n Your significant other walks in & quietly takes a photo of you & the puppy napping on the couch.");											
										}
							}
						
							if(choiceA.equalsIgnoreCase("y")){ //MIDDLE Y
								System.out.println("\n You call with some concerns...");
								System.out.println("\n Our new couch will be destroyed & the puppy has already pooped in the hallway...");
								System.out.println("\n The puppy is so cute but I dont know what to do we need to talk when youre home!");
								
								System.out.println("\n\n Do you want to: \n (x) Play with the puppy   \n  (y) Go for a walk ");
								
								String choiceB = userInput.nextLine();
								
										if(choiceB.equalsIgnoreCase("x")){ // END Y1
											System.out.println("\n You clean up the mess a little bit annoyed mumbling to yourself...");
											System.out.println("\n The puppy nudges your arm then runs away wagging its tail invting you to play...");
											System.out.println("\n You take up the puppy's offer & spend hours running around the house. You become best freinds. ");										
										}
										if(choiceB.equalsIgnoreCase("y")){ // END Y2
											System.out.println("\n You take the puppy for a walk in the nearby park, its such a nice day.");
											System.out.println("\n The puppy is playful and curious about everything...");
											System.out.println("\n After walking the whole park, you meet your significant other at home & spend the whole night thinking of a new name.");
										}
							}
					}	
					System.out.println("\n\nGreat story!");					
			}
				
			if(genre.equalsIgnoreCase("R")){
				System.out.println("Ah a hopeless romantic, I see...");
				
						if(genre.equalsIgnoreCase("R")){  // BEGINNING
						System.out.println("\n They were neighbors in elementary school. They spent recess & after school playing with eachother exlporing nature & feeding fish & birds.");
						System.out.println("\n They grew an innocent crush on eachother...");
						System.out.println("\n one of the families was potentially planning to move due to a work opportunity.");

						System.out.println("\n\n Do you want to: \n (x) Have one of the families move away \n (y) Have the family stay");

						String choiceA = userInput.nextLine();
						
							if(choiceA.equalsIgnoreCase("x")){ //MIDDLE X MOVE
								System.out.println("\n It was terrible news, theyd never see eachother again.");
								System.out.println("\n the kicking and screaming didnt work...it was inevitable theyd be leaving.");
						    System.out.println("\n On their last day of school they said their goodbyes to everyone..."); 
								
								System.out.println("\n\nDo you want to: \n (x) Leave the other person a note  \n (y) Simply say goodbye... ");
								
								String choiceB = userInput.nextLine();
								
										if(choiceB.equalsIgnoreCase("x")){ // END X1 MOVE | note
											System.out.println("\n Nervous and a little bit sad...a note gently came out of the pocket... ");
											System.out.println("\n 20 years later they bumped into eachother while on the same nature tourist trip...");
											System.out.println("\n The person still had the note and they lived happily ever after.");											
										}
										if(choiceB.equalsIgnoreCase("y")){ // END X2 MOVE | bye
											System.out.println("\n They were too embarrased to say anything to eachother and made reluctant goodbyes...");
											System.out.println("\n 20 years later one of them was a journalist covering a nature conservation conference...");
											System.out.println("\n The journalist & guest panel speaker locked eyes & immeditalely recognized eachother - their eyes telling eachother their passed feelings.");											
										}
							}
						
							if(choiceA.equalsIgnoreCase("y")){ //MIDDLE Y STAY
								System.out.println("\n The family decided it was best to stay in their nice neighborhood because they were happy there.");
								System.out.println("\n They remained friends and their secret crushes on eachother grew year after year...");
								System.out.println("\n They began to drift apart their senior year in highschool & form friendships with other groups.");
								
								System.out.println("\n\nDo you want to: \n (x) Do they completely drift apart  \n (y) Do they stay close ");

								
								String choiceB = userInput.nextLine();
								
										if(choiceB.equalsIgnoreCase("x")){ // END Y1 STAY | Apart
											System.out.println("\n The fight was bad enough to never speak again...");
											System.out.println("\n Years later while on a university graduate field excercise in the woods, one of them had a catastrophic emergency...");
											System.out.println("\n A Search & Rescue team was dispatched with the other as a team member...they grew old together.");										
										}
										if(choiceB.equalsIgnoreCase("y")){ // END Y2 STAY \ Close
											System.out.println("\n They graduated togther and went on to be in the same university and field of study.");
											System.out.println("\n While on a lab camping field trip they confessed their years of love.");
											System.out.println("\n they went on to live happily ever after.");
										}
							}
					}	
					System.out.println("\n\nGreat story!");
			}
						
			if(genre.equalsIgnoreCase("S")){
				System.out.println("Hmm do we go aliens or robots...or both?");
				
						if(genre.equalsIgnoreCase("S")){  // BEGINNING
						System.out.println("\n The ship landed...centuries have passed & they arrived to fulfill their cyclic duty.");
						System.out.println("\n The Earth was a different place...inhabited by human beings.");
						System.out.println("\n Their ship hovered above ground scanning...");

						System.out.println("\n\n Do you want to: \n (x) The humans in fear attacked  \n (y) The humans were in schock");

						String choiceA = userInput.nextLine();
						
							if(choiceA.equalsIgnoreCase("x")){ //MIDDLE X ATTACK
								System.out.println("\n The humans declared a state of emergency! Troops began firing at will!");
								System.out.println("\n The ships defense systems activated & disintegrated all the bullets mid air!");
						    System.out.println("\n A massive explosion lit the sky & jossled the ship..."); 
								
								System.out.println("\n\nDo you want to: \n (x) Keep attacking  \n (y) Take cover ");
								
								String choiceB = userInput.nextLine();
								
										if(choiceB.equalsIgnoreCase("x")){ // END X1 ATTACK | attack
											System.out.println("\n The humans advanced their attacks - taking the explosion as an opportunity!");
											System.out.println("\n A magical force field covered the whole area right as flames shot down. They were being protected...");
											System.out.println("\n Another group of beings had arrived to attack them all! This is when the War for Earth began...");											
										}
										if(choiceB.equalsIgnoreCase("y")){ // END X2 ATTACK | cover
											System.out.println("\n The humans in shock ran into buildings and recorded every moment as the ship dug giant chunks from the Earth.");
											System.out.println("\n Suddenly a laser blast destroyed a large section of the ship! A man in a suit appeared in a cloud of electricity!");
											System.out.println("\n He evaporated the ship & removed his helmet...it was Aristotle whome had time travelled for centuries & returned from the future to protect Earth!");											
										}
							}
						
							if(choiceA.equalsIgnoreCase("y")){ //MIDDLE Y SHOCK
								System.out.println("\n The humans couldnt belive their eyes...they were too schocked & panicked to think clearly - fight or flight kicked in!");
								System.out.println("\n Some ran away, some ran towards the ship, others tried fighting!");
								System.out.println("\n The beings enclosed the entire atmosphere in a dome of light!");
								
								System.out.println("\n\nDo you want to: \n (x) Are the beings benevolent  \n (y) Are the being malevolent ");

								
								String choiceB = userInput.nextLine();
								
										if(choiceB.equalsIgnoreCase("x")){ // END Y1 SHOCK | Bene
											System.out.println("\n The forcefield of energy covered the entire globe & each individual...");
											System.out.println("\n The beings advanced powers were able to fix everyones ailments and disabilities.");
											System.out.println("\n Their minds were infused with all the facts & history of the universe...they each grew to know their purpose in life.");										
										}
										if(choiceB.equalsIgnoreCase("y")){ // END Y2 SHOCK | Mal
											System.out.println("\n The light extracted all the minerals & water from the Earth!");
											System.out.println("\n Eerything began to slowly disintegrate & fall apart as the ship zipped away to outer space! In the background the Earth exploded...");
											System.out.println("\n Moments later...the ship exploded to bits from a bomb that was placed by an elite unit during the chaos!");
										}
							}
					}	
					System.out.println("\n\nGreat story!");
			}

			if(genre.equalsIgnoreCase("T")){
				System.out.println("Whats that behind you?");
				
				if(genre.equalsIgnoreCase("T")){  // BEGINNING
						System.out.println("\n It was colder than usual...the fire place crackling in the background made it feel cozy & warm.");
						System.out.println("\n You walk to the kicthen to brew some tea...");
						System.out.println("\n You notice a figure quickly jet across the lawn in your peripherals...");

						System.out.println("\n\n Do you want to: \n (x) Go outside and inspect \n (y) Make sure everything is locked");

						String choiceA = userInput.nextLine();
						
							if(choiceA.equalsIgnoreCase("x")){ //MIDDLE X Inspect
								System.out.println("\n You grab a bat from the garage, turn the light on, & nervously but quietly open the front door...");
								System.out.println("\n You carefully walk around the front, side, and back of the house...you see nothing");
						    System.out.println("\n As you walk back you notice another set of foot prints near yours..."); 
								
								System.out.println("\n\nDo you want to: \n (x) Do you run \n (y) Do you scream in fear");
								
								String choiceB = userInput.nextLine();
								
										if(choiceB.equalsIgnoreCase("x")){ // END X1
											System.out.println("\n You run towards your door & like never before you slip & slam your head... ");
											System.out.println("\n You wake up to very bright light...its morning & youre confused.");
											System.out.println("\n Several feet ahead a man is passed out near your bushes...it was the drunken neighbor whom confused the yards!");											
										}
										if(choiceB.equalsIgnoreCase("y")){ // END X2
											System.out.println("\n Youre shocked at the site & paralyzed in fear...you scream! Something covers your mouth!");
											System.out.println("\n You wrestle away screaming & run but hear foot steps behind you!");
											System.out.println("\n At the last moment a bunch of cop cars arrive that were in pursuit of a deranged fugitive!");											
										}
							}
						
							if(choiceA.equalsIgnoreCase("y")){ //MIDDLE Y
								System.out.println("\n You immediately turn on the lights and hurridly do checks on every lock...");
								System.out.println("\n You hear a crash and voices...");
								System.out.println("\n You immediately pause in fear...you dont move a muscle trying to hear...");
								
								System.out.println("\n\nDo you want to: \n (x) Inspect the noise \n (y) Call the police");
								
								String choiceB = userInput.nextLine();
								
										if(choiceB.equalsIgnoreCase("x")){ // END Y1
											System.out.println("\n You bravely sneak walk in the direction of the noise...you remember you forgot to lock the garage door...");
											System.out.println("\n As you approach the area...you hear more whispering & your gut sinks...you take a deep breathe & PUSH OPEN the door!");
											System.out.println("\n SURPRISE! Its your family coming to visit you for your birthday...one week early!");										
										}
										if(choiceB.equalsIgnoreCase("y")){ // END Y2
											System.out.println("\n You diall the number...your hands are shaking & your voice is cracking as you whisper to the dispatch...");
											System.out.println("\n You breathe as quietly as you can...it was only a few minutes but felt like hours until you saw the Blue & red reflections bounce off the walls...");
											System.out.println("\n You run out...they run in...screaming & more screaming to get down...after several minutes all your friends who were surprising you a week early for your BDay walk out with hands up!");
										}
							}
					}	
					System.out.println("\n\nGreat story!");
			}
			
			System.out.println("\n Do you want to continue? \n Yes/ y  - OR - No/ n");
			
			proceed = userInput.nextLine();				
		}
		
		while(proceed.equalsIgnoreCase("Yes") || proceed.equalsIgnoreCase("Y") );
		
		System.out.println("Okay, good bye!");
		
	}
	
}	