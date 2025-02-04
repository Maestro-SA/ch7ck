(ns com.ch7ck.components.shared 
  (:require
    [com.ch7ck.components.svgs :as svg]))


(defn heading [text]
  [:div
   [:h1
    {:class "text-4xl font-semibold text-gray-900 capitalize lg:text-5xl"}
    text]
   [:div
    {:class "mt-2"}
    [:span {:class "inline-block w-40 h-1 bg-gray-900 rounded-full"}]
    [:span
     {:class "inline-block w-3 h-1 ml-1 bg-gray-900 rounded-full"}]
    [:span
     {:class "inline-block w-1 h-1 ml-1 bg-gray-900 rounded-full"}]]])

(defn heading-with-extra-text [text extratext]
  [:div
   [:h1
    {:class "text-4xl font-semibold text-gray-900 capitalize lg:text-5xl"}
    text
    [:br]
    [:span {:class "text-2xl lg:text-3xl"}
     extratext]]
   [:div
    {:class "mt-2"}
    [:span {:class "inline-block w-40 h-1 bg-gray-900 rounded-full"}]
    [:span
     {:class "inline-block w-3 h-1 ml-1 bg-gray-900 rounded-full"}]
    [:span
     {:class "inline-block w-1 h-1 ml-1 bg-gray-900 rounded-full"}]]])

(defn info-badge [text]
  [:span
   {:class "inline-flex items-center m-2 px-3 py-1 bg-blue-200 hover:bg-blue-300 rounded-full text-sm font-semibold text-blue-600"}
   (svg/info)
   [:span {:class "ml-1"} 
    text]])