(ns com.ch7ck.components.headers
  (:require [com.ch7ck.components.heros :as heros]))


(defn navbar []
  [:nav
   {:x-data "{ currentPath: window.location.pathname }"
    :class "bg-white"}
   [:div
    {:class "container flex flex-col items-center p-6 mx-auto"}
    [:a
     {:href "/", :class "mx-auto"}
     [:img
      {:class "w-auto w-32 sm:w-60",
       :src "/img/logo.png",
       :alt ""}]]
    [:div
     {:class "flex items-center justify-center mt-6 text-gray-900 capitalize"}
     [:a
      {:href "/",
       :class "mx-2 text-gray-900 sm:mx-6 hover:border-b-2 hover:border-gray-900"
       :x-bind:class "{ 'border-b-2 border-gray-900': currentPath === '/' }"}
      "home"]
     [:a
      {:href "/about-me",
       :class "mx-2 text-gray-900 sm:mx-6 hover:border-b-2 hover:border-gray-900"
       :x-bind:class "{ 'border-b-2 border-gray-900': currentPath === '/about-me' }"}
      "about"]
     [:a
      {:href "/blog",
       :class "mx-2 text-gray-900 sm:mx-6 hover:border-b-2 hover:border-gray-900"
       :x-bind:class "{ 'border-b-2 border-gray-900': currentPath === '/blog' }"}
      "blog"]
     [:a
      {:href "/contact-me",
       :class "mx-2 text-gray-900 sm:mx-6 hover:border-b-2 hover:border-gray-900"
       :x-bind:class "{ 'border-b-2 border-gray-900': currentPath === '/contact-me' }"}
      "contact"]]]])

(defn header []
  [:header
   {:class '("bg-[url('https://images.unsplash.com/photo-1594922234647-4ade6282c369?q=80&w=2940&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D')]"
             bg-cover bg-no-repeat)}
   (navbar)
   (heros/hero)])

(defn page-header [title]
  [:header
   {:class "circuit-board-background bg-cover bg-no-repeat"}
   (navbar)
   (heros/page-hero title)])