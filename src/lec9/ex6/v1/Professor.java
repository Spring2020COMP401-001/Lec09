package lec9.ex6.v1;

public interface Professor {
	
	enum Rank {ASSISTANT, ASSOCIATE, FULL};
	
	void promote();
	Rank getRank();
}
