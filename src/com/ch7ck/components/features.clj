(ns com.ch7ck.components.features)

(defn feature []
  [:section
   {:class "relative pt-16 bg-gradient-to-r from-purple-600 to-blue-600"}
   [:div
    {:class "max-w-screen-xl mx-auto"}
    [:div
     {:class "flex flex-wrap items-center"}
     [:div
      {:class "w-10/12 md:w-6/12 lg:w-4/12 px-12 md:px-4 mr-auto ml-auto -mt-78"}
      [:div
       {:class "relative flex flex-col min-w-0 break-words bg-white w-full mb-6 shadow-lg rounded-lg bg-blue-500"}
       [:img
        {:alt "...",
         :src "https://images.unsplash.com/photo-1498050108023-c5249f4df085?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=700&q=80",
         :class "w-full align-middle rounded-t-lg"}]
       [:blockquote
        {:class "relative p-8 mb-4"}
        [:svg
         {:preserveaspectratio "none",
          :xmlns "http://www.w3.org/2000/svg",
          :viewBox "0 0 583 95",
          :class "absolute left-0 w-full block h-92-px -top-94-px"}
         [:polygon
          {:points "-30,95 583,95 583,65",
           :class "text-blue-500 fill-current"}]]
        [:h4
         {:class "text-xl font-bold text-white"}
         "Great for your awesome project"]
        [:p
         {:class "text-md font-light mt-2 text-white"}
         "Putting together a page has never been easier than matching together pre-made components. From landing pages presentation to login areas, you can easily customise and built your pages."]]]]
     [:div
      {:class "w-full md:w-6/12 px-4"}
      [:div
       {:class "flex flex-wrap"}
       [:div
        {:class "w-full md:w-6/12 px-4"}
        [:div
         {:class "relative flex flex-col mt-4"}
         [:div
          {:class "px-4 py-5 flex-auto"}
          [:div
           {:class "text-blueGray-500 p-3 text-center inline-flex items-center justify-center w-12 h-12 mb-5 shadow-lg rounded-full bg-white"}
           [:i {:class "fas fa-sitemap"}]]
          [:h6 {:class "text-xl mb-1 font-semibold"} "CSS Components"]
          [:p
           {:class "mb-4 text-blueGray-500"}
           "Notus JS comes with a huge number of Fully Coded CSS components."]]]
        [:div
         {:class "relative flex flex-col min-w-0"}
         [:div
          {:class "px-4 py-5 flex-auto"}
          [:div
           {:class "text-blueGray-500 p-3 text-center inline-flex items-center justify-center w-12 h-12 mb-5 shadow-lg rounded-full bg-white"}
           [:i {:class "fas fa-drafting-compass"}]]
          [:h6
           {:class "text-xl mb-1 font-semibold"}
           "JavaScript Components"]
          [:p
           {:class "mb-4 text-blueGray-500"}
           "We also feature many dynamic components for React, NextJS,     Vue and Angular."]]]]
       [:div
        {:class "w-full md:w-6/12 px-4"}
        [:div
         {:class "relative flex flex-col min-w-0 mt-4"}
         [:div
          {:class "px-4 py-5 flex-auto"}
          [:div
           {:class "text-blueGray-500 p-3 text-center inline-flex items-center justify-center w-12 h-12 mb-5 shadow-lg rounded-full bg-white"}
           [:i {:class "fas fa-newspaper"}]]
          [:h6 {:class "text-xl mb-1 font-semibold"} "Pages"]
          [:p
           {:class "mb-4 text-blueGray-500"}
           "This extension also comes with 3 sample pages. They are fully coded so you can start working instantly."]]]
        [:div
         {:class "relative flex flex-col min-w-0"}
         [:div
          {:class "px-4 py-5 flex-auto"}
          [:div
           {:class "text-blueGray-500 p-3 text-center inline-flex items-center justify-center w-12 h-12 mb-5 shadow-lg rounded-full bg-white"}
           [:i {:class "fas fa-file-alt"}]]
          [:h6 {:class "text-xl mb-1 font-semibold"} 
           "Documentation"]
          [:p
           {:class "mb-4 text-blueGray-500"}
           "Built by developers for developers. You will love how easy is to to work with Notus JS."]]]]]]]]])