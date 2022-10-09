package racingcar.service;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.*;
import racingcar.utils.inputOutputMessage;
import racingcar.utils.exceptionMessage;

import java.util.ArrayList;
import java.util.List;

public class racingcarServiceImple implements racingcarService{
    private List<racingCar> car = new ArrayList<>();
    private racingcarMoveCount moveCount;
    private racingCars cars;

    private inputOutputMessage message = new inputOutputMessage();
    private exceptionMessage exceptionMessage = new exceptionMessage();
    private String winner = "";


    public void inputracingCars(){
        message.inputNameMessage();
        try {
            String[] carNamesArr = Console.readLine().split(",");
            for(String carName : carNamesArr){
                car.add(new racingCar(new racingcarName(carName),new racingcarPosition(0)));
            }
            cars = new racingCars(car);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public void validationNameCheck(String carNameCheck){
        if(carNameCheck.length() == 0)
            throw new IllegalArgumentException(exceptionMessage.noInputCarName());
        if(carNameCheck.length()>5)
            throw new IllegalArgumentException(exceptionMessage.InputCarName5Over());
    }
    public void inputracingCount(){
        message.inputCountMessage();
        moveCount = new racingcarMoveCount(Console.readLine());
    }

    public boolean createRandomnumber(){
        int randomNumber = Randoms.pickNumberInRange(0,9);
        if(randomNumber >= 4)
            return true;
        return false;
    }

    public void inputracingPosition(){
       for(int i = 0 ; i<cars.getCars().size();i++) {
           if(createRandomnumber()) {
               int temp = cars.getCars().get(i).getPositionClass().getPosition();
               cars.getCars().get(i).getPositionClass().setPosition(temp+1);
               //System.out.println(car.get(i).getPositionClass().getPosition());
           }
       }
    }

    public void printResult(){
        for(int i = 0 ; i<cars.getCars().size();i++) {
           System.out.println(cars.getCars().get(i).getCarNameClass().getCarName()+ " : " + cars.getCars().get(i).getPositionClass());
        }
    }

    public int getMoveCount(){
        return Integer.parseInt(moveCount.getMoveCount());
    }

    public void racingWinner(){
        int MaxPosition = Integer.MIN_VALUE;
        for(int i = 0 ; i<cars.getCars().size();i++) {
            MaxPosition = Integer.max(MaxPosition,cars.getCars().get(i).getPositionClass().getPosition());
        }
        for(int i = 0 ; i<cars.getCars().size();i++) {
            if(cars.getCars().get(i).getPositionClass().getPosition() == MaxPosition){
               winner +=  (cars.getCars().get(i).getCarNameClass().getCarName());
            }
        }

        System.out.println(message.outputMessage()+winner);
    }

}
