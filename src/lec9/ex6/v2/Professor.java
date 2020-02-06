package lec9.ex6.v2;

public interface Professor extends Person {
	
	enum Rank {ASSISTANT, ASSOCIATE, FULL};
	
	void promote();
	Rank getRank();
}
