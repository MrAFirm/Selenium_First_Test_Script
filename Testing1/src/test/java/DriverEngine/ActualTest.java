package DriverEngine;

import org.example.Action.ActionsToPerform;
import org.example.ExcelUtils.GetDataFromExcel;

public class ActualTest
{
    public static void  main(String[] args)
    {
        GetDataFromExcel getDataFromExcel = new GetDataFromExcel();

        getDataFromExcel.getFile(4);

        ActionsToPerform actionsToPerform = new ActionsToPerform();

        actionsToPerform.launchBrowser();

        actionsToPerform.open();

        actionsToPerform.click();

        actionsToPerform.verifyText();

        actionsToPerform.quit();
        System.out.println("Keyword Driven testing framework executed successfully");
    }
}
