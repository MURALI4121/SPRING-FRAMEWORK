package com.SpringFrameWork.LearningSpringFramework;

import com.SpringFrameWork.LearningSpringFramework.game.GameRunner;
import com.SpringFrameWork.LearningSpringFramework.game.MarioGame;
import com.SpringFrameWork.LearningSpringFramework.game.PacManGame;
import com.SpringFrameWork.LearningSpringFramework.game.SuperContraGame;

public class App01BasicGame {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		var game = new PacManGame();
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	} 

}
