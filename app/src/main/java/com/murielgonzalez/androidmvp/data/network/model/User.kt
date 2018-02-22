package com.murielgonzalez.androidmvp.data.network.model

import com.google.gson.annotations.SerializedName

/**
 * Created by muriel_gonzalez on 2/21/18.
 */

data class User(
		@SerializedName("login") val login: String,
		@SerializedName("id") val id: Int,
		@SerializedName("avatar_url") val avatarUrl: String,
		@SerializedName("gravatar_id") val gravatarId: String,
		@SerializedName("name") val name: String,
		@SerializedName("company") val company: String,
		@SerializedName("blog") val blog: String,
		@SerializedName("location") val location: String,
		@SerializedName("email") val email: String,
		@SerializedName("hireable") val hireable: Boolean,
		@SerializedName("bio") val bio: String,
		@SerializedName("public_repos") val publicRepos: Int,
		@SerializedName("public_gists") val publicGists: Int,
		@SerializedName("followers") val followers: Int,
		@SerializedName("following") val following: Int
)