package practicePrbDay21;

public class MoodAnalyser {
	
		    public static String analyseMood(String message) throws IllegalArgumentException {
		        if (message == null || message.trim().isEmpty()) {
		            throw new IllegalArgumentException("Message cannot be null or empty.");
		        }
		        if (message.toLowerCase().contains("happy")) {
		            return "happy";
		        }
		        return "sad";
		    }

		    public static void main(String[] args) {
		        try {
		            String message = "I am feeling happy today!";
		            String mood = analyseMood(message);
		            System.out.println(message + " the mood is " + mood); // prints "happy"

		            message = "I am feeling sad today.";
		            mood = analyseMood(message);
		            System.out.println(message + " the mood is " +mood); // prints "sad"

		            message = null;
		            mood = analyseMood(message);
		            System.out.println(message + " the mood is " +mood); // this line will not be reached
		        } catch (IllegalArgumentException e) {
		            System.out.println(e.getMessage());
		        }
		    }
		}





