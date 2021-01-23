package com.muqit.kharredovendorpanel.API;


import com.muqit.kharredovendorpanel.Models.CommonResponse;
import com.muqit.kharredovendorpanel.Models.VendorDetailResponse;
import com.muqit.kharredovendorpanel.Models.VendorsResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitAPI {
    @FormUrlEncoded
    @POST("/android/slugify.php")
    Call<CommonResponse> AddCategory(@Field("name") String str, @Field("category_id") String str2, @Field("photo") String str3);


    @GET("/android/featuredprod.php")
    Call<CommonResponse> AddFeaturedProduct(@Query("id") String str);

    @FormUrlEncoded
    @POST("/android/add-product.php")
    Call<CommonResponse> AddProduct(@Field("name") String str, @Field("category_id") String str2, @Field("price") String str3, @Field("description") String str4, @Field("photo") String str5, @Field("qty") String str6, @Field("weight") String str7, @Field("dimension") String str8, @Field("shipping-price") String str9, @Field("sale_start") String str10, @Field("sale_end") String str11, @Field("sale") String str12);


    @FormUrlEncoded
    @POST("/android/veninsert.php")
    Call<CommonResponse> AddVendor(@Field("fname") String str, @Field("lname") String str2, @Field("email") String str3, @Field("password") String str4, @Field("repassword") String str5, @Field("phone") String str6, @Field("address") String str7, @Field("logo") String str8, @Field("cnicImage") String str9, @Field("city") String str10, @Field("country") String str11, @Field("state") String str12, @Field("company") String str13);

    @GET("/android/prodblock.php")
    Call<CommonResponse> BlockProduct(@Query("id") String str, @Query("status") int i);

    @GET("/android/empblock.php")
    Call<CommonResponse> BlockUser(@Query("id") String str, @Query("status") int i);



    @GET("/android/orderstatus.php")
    Call<CommonResponse> ChangeOrderStatus(@Query("id") String str, @Query("status") String str2);



    @GET("/android/delcategory.php")
    Call<CommonResponse> DeleteCategory(@Query("id") String str);


    @FormUrlEncoded
    @POST("/android/editproduct.php")
    Call<CommonResponse> EditProduct(@Field("id") String str, @Field("name") String str2, @Field("category") String str3, @Field("price") String str4, @Field("description") String str5, @Field("sale_start") String str6, @Field("sale_end") String str7, @Field("sale") String str8);



    @GET("/android/brand.php")
    Call<CommonResponse> MakeBrand(@Query("id") String str);

    @GET("/android/wholesale.php")
    Call<CommonResponse> MakeFeatured(@Query("id") String str);

    @GET("/android/shop.php")
    Call<CommonResponse> MakeShop(@Query("id") String str);

    @GET("/android/wholesale.php")
    Call<CommonResponse> MakeWholeSale(@Query("id") String str);



    @GET("/android/catgegoryupd.php")
    Call<CommonResponse> UpdateCategory(@Query("id") String str, @Query("commission") String str2);

    @GET("/android/empupd.php")
    Call<CommonResponse> UpdateEmployee(@Query("id") String str, @Query("firstname") String str2, @Query("lastname") String str3, @Query("password") String str4, @Query("address") String str5, @Query("phone") String str6, @Query("email") String str7);

    @FormUrlEncoded
    @POST("/android/empimage.php")
    Call<CommonResponse> UpdateEmployeeImage(@Field("id") String str, @Field("photo") String str2);

    @GET("/android/venupd.php")
    Call<CommonResponse> UpdateVendor(@Query("id") String str, @Query("firstname") String str2, @Query("lastname") String str3, @Query("email") String str4, @Query("password") String str5, @Query("phone") String str6, @Query("address") String str7, @Query("city") String str8, @Query("country") String str9, @Query("state") String str10, @Query("company") String str11);

    @GET("/android/vendetail.php")  
    Call<VendorDetailResponse> VendorDetail(@Query("id") String str);




    @GET("/android/vendors.php")
    Call<VendorsResponse> getVendorsDetails();



    @POST("/android/blog_insertion.php")
    @FormUrlEncoded
    Call<CommonResponse> InsertBlog(@Field("title") String Title,@Field("t_image") String TitleImage,@Field("b_image") String BannerImage,@Field("t_des") String TitleDescription,@Field("des") String Description);

    @POST("/android/Add_new_banner.php")
    @FormUrlEncoded
    Call<CommonResponse> InsertBanner(@Field("cover") String BannerPhoto,@Field("heading") String Heading,@Field("description") String Description);

    @POST("/android/blog_insertion.php")
    @FormUrlEncoded
    Call<CommonResponse> UpdateBlog(@Field("title") String Title,@Field("t_image") String TitleImage,@Field("b_image") String BannerImage,@Field("t_des") String TitleDescription,@Field("des") String Description,@Field("id") String ID);

    @POST("/android/sale.php")
    @FormUrlEncoded
    Call<CommonResponse> DeleteBlog(@Field("id") String ID);
}
