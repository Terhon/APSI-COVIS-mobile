package com.main.covis.covid_plot;

public class CovidPlotPresenter implements CovidPlotContract.Presenter {

    private CovidPlotModel covidData;

    public CovidPlotPresenter(){
        CovidPlotModel newCovidData = new CovidPlotModel("Wszyscy umrzemy");
        this.covidData = newCovidData;
    }
    @Override
    public String getResult(){
        String message = covidData.getMsg();
        return message;
    }


}
