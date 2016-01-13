package ie.gmit.sw;

public class Result implements Resultable {
	private String plainText;
	private int key;
	private double score;

	public Result(String plainText, int key, double score) {
		super();
		this.plainText = plainText;
		this.key = key;
		this.score = score;
	}

	public void printResult() {
		System.out.println("PlainText: " + this.plainText);
		System.out.println("Score: " + this.score);
		System.out.println("Key: " + this.key);
		System.out.println("\n");
	}

	@Override
	public String getPlainText() {
		return plainText;
	}

	@Override
	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	@Override
	public int getKey() {
		return key;
	}

	@Override
	public void setKey(int key) {
		this.key = key;
	}

	@Override
	public double getScore() {
		return score;
	}

	@Override
	public void setScore(double score) {
		this.score = score;
	}
}
