package com.revature.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.revature.beans.Warrior;
import com.revature.service.Fight;

class FightTest {
	Warrior mikey=  new Warrior("Mikey",200,4);
	Warrior steven=  new Warrior("Steven",150,8);
	Fight fight= new Fight();
	@Test
	void fightTest() {
		fight.fightTime(mikey, steven);
		//expected, actual
		assertEquals(146,steven.getHp());
	}

}
