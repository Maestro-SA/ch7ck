(ns com.ch7ck.components.timelines)

(defn timeline []
  [:section
   {:class "bg-gray-100 text-gray-800"}
   [:div
    {:class "container px-4 py-12 mx-auto"}
    [:div
     {:class "grid gap-4 mx-4 sm:grid-cols-12"}
     [:div
      {:class "col-span-12 sm:col-span-3"}
      [:div
       {:class "text-center sm:text-left mb-14 before:block before:w-24 before:h-3 before:mb-5 before:rounded-md before:mx-auto sm:before:mx-0 before:bg-blue-600"}
       [:h3 {:class "text-3xl font-semibold"} "Sithabiso Makhathini"]
       [:span
        {:class "text-sm font-bold tracking-wider uppercase text-gray-600"}
        "What I have been up to"]]]
     [:div
      {:class "relative col-span-12 px-4 space-y-6 sm:col-span-9"}
      [:div
       {:class "col-span-12 space-y-12 relative px-4 sm:col-span-8 sm:space-y-8 sm:before:absolute sm:before:top-2 sm:before:bottom-0 sm:before:w-0.5 sm:before:-left-3 before:bg-gray-300"}
       [:div
        {:class "flex flex-col sm:relative sm:before:absolute sm:before:top-2 sm:before:w-4 sm:before:h-4 sm:before:rounded-full sm:before:left-[-35px] sm:before:z-[1] before:bg-blue-600"}
        [:h3
         {:class "text-xl font-semibold tracking-wide"}
         "Software Engineer"]
        [:time
         {:class "text-xs tracking-wide uppercase text-gray-600"}
         "Jun 2023"]
        [:p
         {:class "mt-3"}
         "Transitioned to a Software Engineer role at Simply, taking ownership of payment gateway API integrations and salary deduction collections domains, while contributing to the Collections team through shaping, copywriting, full-stack solution design, implementation, delivery, and ongoing maintenance and support."]]
       [:div
        {:class "flex flex-col sm:relative sm:before:absolute sm:before:top-2 sm:before:w-4 sm:before:h-4 sm:before:rounded-full sm:before:left-[-35px] sm:before:z-[1] before:bg-blue-600"}
        [:h3
         {:class "text-xl font-semibold tracking-wide"}
         "Support Engineer"]
        [:time
         {:class "text-xs tracking-wide uppercase text-gray-600"}
         "Jul 2021"]
        [:p
         {:class "mt-3"}
         "Started working as a Support Engineer at Simply, where I leveraged GCP to rectify data issues, wrote helper code for efficient data fixes, debugged and resolved application errors, enhanced feature functionality, and facilitated a monthly salary deduction process."]]
       [:div
        {:class "flex flex-col sm:relative sm:before:absolute sm:before:top-2 sm:before:w-4 sm:before:h-4 sm:before:rounded-full sm:before:left-[-35px] sm:before:z-[1] before:bg-blue-600"}
        [:h3
         {:class "text-xl font-semibold tracking-wide"}
         "Degree in Computer Science"]
        [:time
         {:class "text-xs tracking-wide uppercase text-gray-600"}
         "Dec 2020"]
        [:p
         {:class "mt-3"}
         "Obtained a degree in Information Technology from the University of the Free State. I majored in Computer Science and minored in Business."]]]]]]])