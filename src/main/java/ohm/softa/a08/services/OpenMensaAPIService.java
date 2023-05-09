package ohm.softa.a08.services;

import ohm.softa.a08.api.OpenMensaAPI;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class OpenMensaAPIService {
	private static  OpenMensaAPIService instance;
	private final OpenMensaAPI mensaApiInstance;

	private OpenMensaAPIService(){
		HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
		loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

		OkHttpClient client = new OkHttpClient.Builder()
			.addInterceptor(loggingInterceptor)
			.build();

		Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create())
			.baseUrl("https://openmensa.org/api/v2/")
			.client(client)
			.build();

		mensaApiInstance = retrofit.create(OpenMensaAPI.class);
	}
	public static OpenMensaAPIService getInstance(){
		if(instance==null)
			instance=new OpenMensaAPIService();
		return instance;
	}
	public OpenMensaAPI getApi(){
		return mensaApiInstance;
	}
}
