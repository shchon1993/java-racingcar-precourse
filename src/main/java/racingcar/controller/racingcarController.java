package racingcar.controller;

import racingcar.service.racingcarService;
import racingcar.service.racingcarServiceImple;
import racingcar.utils.inputOutputMessage;


public class racingcarController {
    private racingcarService racingcarService = new racingcarServiceImple();
    private inputOutputMessage message = new inputOutputMessage();
    public void run(){
        racingcarService.inputracingCars();
        racingcarService.inputracingCount();
        play();
    }

    public void play(){
        int moveCount = racingcarService.getMoveCount();
        for(int i = 0; i<moveCount; i++){
            message.executionMessage();
            racingcarService.inputracingPosition();
            racingcarService.printResult();
            System.out.println();
        }
    }
}
