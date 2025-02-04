(ns com.ch7ck.contact
  (:require [com.ch7ck.ui :as ui]
            [com.ch7ck.components.headers :as headers]
            [com.ch7ck.components.footers :as footers]
            [com.ch7ck.components.svgs :as svgs]))


(defn contact []
  [:section
   {:class "bg-white"}
   [:div
    {:class "container px-6 py-12 mx-auto"}
    [:div
     {:class "text-center"} 
     [:h1
      {:class "mt-2 text-2xl font-semibold text-gray-900 md:text-3xl"}
      "Get in touch"]
     [:p
      {:class "mt-3 text-gray-500"}
      "Happy to have a chat."]]
    [:div
     {:class "grid grid-cols-1 gap-12 mt-10 md:grid-cols-2 lg:grid-cols-3"}
     [:div
      {:class "flex flex-col items-center justify-center text-center"}
      [:span
       {:class "p-3 text-black rounded-full bg-gray-600"}
       (svgs/email)]
      [:h2
       {:class "mt-4 text-lg font-medium text-gray-900"}
       "Email"]
      [:p
       {:class "mt-2 text-gray-500"}
       "Connect with me via email."]
      [:a
       {:href "mailto:makhathinisithabiso@gmail.com"
        :class "mt-2 text-blue-500"}
       "makhathinisithabiso@gmail.com"]]
     [:div
      {:class "flex flex-col items-center justify-center text-center"}
      [:span
       {:class "p-3 text-blue-500 rounded-full bg-gray-600"}
       (svgs/linkedin)]
      [:h2
       {:class "mt-4 text-lg font-medium text-gray-900"}
       "LinkedIn"]
      [:p
       {:class "mt-2 text-gray-500"}
       "Connect with me on LinkedIn."]
      [:a
       {:href "https://www.linkedin.com/in/makhathinisithabiso/"
        :class "mt-2 text-blue-500"}
       "Sithabiso Makhathini"]]
     [:div
      {:class "flex flex-col items-center justify-center text-center"}
      [:span
       {:class "p-3 text-black rounded-full bg-gray-600"}
       (svgs/phone)]
      [:h2
       {:class "mt-4 text-lg font-medium text-gray-900"}
       "Phone"]
      [:p
       {:class "mt-2 text-gray-500"}
       "Give me a call."]
      [:a
       {:href "tel:+27789482065"
        :class "mt-2 text-blue-500"}
       "+27 (78) 948-2065"]]]]])

(defn contact-page [ctx]
  (ui/page
   ctx
   (headers/page-header "Contact me.")
   (contact)
   (footers/footer)))

(def module
  {:routes [["" {}
             ["/contact-me" {:get contact-page}]]]})