package cards;

public class UnoCard extends Card {
	
	private boolean reverse;
	private int drawAmount;
	private boolean wild;
	private boolean skip;
	
	// Constructor to initialize UnoCard object
	public UnoCard(int cardNumber) {
		super(cardNumber); // Call superclass constructor to initialize common attributes
		createCard(); // Initialize UnoCard-specific attributes
	}
	
	public boolean isReverse() {
		return reverse;
	}
	
	public int getDrawAmount() {
		return drawAmount;
	}
	
	protected void setReverse(boolean reverse) {	// Not sure if I need all the setters
		this.reverse = reverse;
	}

	protected void setDrawAmount(int drawAmount) {
		this.drawAmount = drawAmount;
	}

	protected void setWild(boolean wild) {
		this.wild = wild;
	}

	protected void setSkip(boolean skip) {
		this.skip = skip;
	}

	public boolean isWild() {
		return wild;
	}
	public boolean isSkip() {
		return skip;
	}

	// Call superclass constructor to initialize common attributes
	@Override
	protected void createCard() {

    if (cardNumber > 96) {
    	switch(cardNumber) {
    	case 97:
    		this.face = "0"; // Zero
    		this.color = "r";
    		break;
    	case 98:
    		this.face = "0"; // Zero
    		this.color = "y";
    		break;
    	case 99:
    		this.face = "0"; // Zero
    		this.color = "g";
    		break;
    	case 100:
    		this.face = "0"; // Zero
    		this.color = "b";
    		break;
    	case 101:
    		this.face = "D4";
    		this.color = "r";
    		break;
    	case 102:
    		this.face = "D4";
    		this.color = "y";
    		break;
    	case 103:
    		this.face = "D4";
    		this.color = "g";
    		break;
    	case 104:
    		this.face = "D4";
    		this.color = "b";
    		break;
    	default:
    		this.face = "WD";
    		this.color = "w";
    	}
    } else {
    	// Determine color index and face index based on card number
		int colorIndex = (cardNumber - 1) / 24; // 27 cards per color including Wilds and Draw +4 - 24 because that includes both sets of the same color.
        int faceIndex = ((cardNumber - 1) % 12); // 2 cards per face - use 12 because each set of cards has 12 cards
    	switch (colorIndex) {
    	case 0:
            this.color = "r"; // Red
            break;
        case 1:
            this.color = "y"; // Yellow
            break;
        case 2:
            this.color = "g"; // Green
            break;
        case 3:
            this.color = "b"; // Blue
            break;
    }

            // Determine face based on face index
    switch (faceIndex) {
        case 9:
            this.face = "SK"; // Skip
            break;
        case 10:
            this.face = "RV"; // Reverse
            break;
        case 11:
            this.face = "D2"; // Draw 2
            break;
        default:	// if it does not fit into any other cases use this
        	this.face = Integer.toString(faceIndex + 1); // Numeric face value
            break;
    	}
    }
}
			
	@Override
	public String toString() {
		return getFace() + getColor();
	}	
	
}
