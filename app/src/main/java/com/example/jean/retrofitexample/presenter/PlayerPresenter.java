package com.example.jean.retrofitexample.presenter;

import com.example.jean.retrofitexample.model.HistoryItem;
import com.example.jean.retrofitexample.model.RestResponse;
import com.example.jean.retrofitexample.service.ApiService;
import com.example.jean.retrofitexample.view.FootBallView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * This class represents the country view interface.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 29/07/16.
 * Jesus loves you.
 */
public class PlayerPresenter {

    private FootBallView footBallView;
    private ApiService countryService;

    public PlayerPresenter(FootBallView view) {
        this.footBallView = view;

        if (this.countryService == null) {
            this.countryService = new ApiService();
        }
    }

  public void getPlayers() {
//

      countryService
              .getAPI()
              .getResults()
              .enqueue(new Callback<RestResponse>() {
          @Override
          public void onResponse(Call<RestResponse> call, Response<RestResponse> response) {
              RestResponse data = response.body();

              if (data != null && data.getResult() != null) {
                         List<HistoryItem> result = data.getResult();
                         footBallView.listOfPlayers(result);               }

          }

          @Override
          public void onFailure(Call<RestResponse> call, Throwable t) {

          }
      });
  }



}
