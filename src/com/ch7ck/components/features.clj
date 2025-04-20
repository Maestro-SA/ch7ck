(ns com.ch7ck.components.features
  (:require [com.ch7ck.components.svgs :as svg]
            [com.ch7ck.components.shared :as shared]))


(defn skills-overview []
  [:section
   {:class "bg-white"}
   [:div
    {:class "px-4 py-8 mx-auto sm:max-w-xl md:max-w-full lg:max-w-screen-xl md:px-24 lg:px-8 lg:py-16"}
    (shared/heading-with-extra-text "Technical Skills" "Overview")
    [:div
     {:class "mt-8 xl:mt-12 lg:flex lg:items-center"}
     [:div
      {:class "grid w-full grid-cols-1 gap-8 lg:w-1/2 xl:gap-16 md:grid-cols-2"}
      [:div
       {:class "space-y-3"}
       [:span
        {:class "inline-block p-3 text-metagray rounded-full bg-gray-100 shadow-2xl"}
        (svg/laptop-code)]
       [:h1
        {:class "text-xl font-semibold text-gray-700 capitalize"}
        "Languages & Paradigms"]
       [:p
        {:class "text-gray-500"}
        "Deep understanding of functional programming and practical use of Clojure, ClojureScript, and JavaScript."]]
      [:div
       {:class "space-y-3"}
       [:span
        {:class "inline-block p-3 text-metagray rounded-full bg-gray-100 shadow-2xl"}
        (svg/frontend)]
       [:h1
        {:class
         "text-xl font-semibold text-gray-700 capitalize"}
        "Frontend Development"]
       [:p
        {:class "text-gray-500"}
        "Building rich, dynamic user interfaces with state management and modern UI libraries."]]
      [:div
       {:class "space-y-3"}
       [:span
        {:class "inline-block p-3 text-metagray rounded-full bg-gray-100 shadow-2xl"}
        (svg/backend)]
       [:h1
        {:class
         "text-xl font-semibold text-gray-700 capitalize"}
        "Backend Development"]
       [:p
        {:class "text-gray-500"}
        "Designing modular, decoupled architectures for robust and maintainable systems."]]
      [:div
       {:class "space-y-3"}
       [:span
        {:class "inline-block p-3 text-metagray rounded-full bg-gray-100 shadow-2xl"}
        (svg/cloud)]
       [:h1
        {:class "text-xl font-semibold text-gray-700 capitalize"}
        "Cloud & Infrastructure"]
       [:p
        {:class "text-gray-500"}
        "Proficient in leveraging cloud platforms, containerization, and event-driven architectures."]]]
     [:div
      {:class "hidden lg:flex lg:w-1/2 lg:justify-center"}
      [:img
       {:class "w-[28rem] h-[28rem] flex-shrink-0 object-cover xl:w-[34rem] xl:h-[34rem] rounded-full",
        :src "/img/IMG_7142.jpg",
        :alt ""}]]]]])

(defn skill [& {:keys [id svg name desc attrs]}]
  [:section
   {:id id
    :class "bg-white"}
   [:div
    {:class "py-2 md:py-4"}
    [:div
     {:class "flex flex-wrap items-center"}
     [:div
      {:class "w-full mx-auto"}
      (shared/heading name)
      [:p
       {:class "text-xl font-light leading-relaxed mt-4 mb-4 text-metagray"}
       desc]
      [:ul
       {:class "text-lg mb-4 -ml-1 space-y-2"}
       (for [{:keys [attr-name attr-desc]} attrs]
         [:li
          {:class "flex items-start"}
          [:div
           {:class "-ml-10 mr-1"}
           (svg/lightning)]
          [:div
           [:span
            {:class "font-semibold"}
            attr-name] ": "
           [:span attr-desc]]])]]]]])

(defn skills []
  [:div
   {:class "px-4 pb-8 mx-auto sm:max-w-xl md:max-w-full lg:max-w-screen-xl md:px-24 lg:px-8 lg:pb-16"}
   (skill
    :id "languages-paradigms"
    :svg (svg/lisp)
    :name "Languages & Paradigms"
    :desc "Developing software with Clojure, ClojureScript, and other modern languages and paradigms."
    :attrs [{:attr-name "Clojure"
             :attr-desc "Proficient in functional programming and experienced with Polylith, Babashka, and Integrant for building maintainable, scalable systems."}
            {:attr-name "ClojureScript"
             :attr-desc "Skilled in Reagent, Re-frame, and Rum for creating interactive, performant UIs."}
            {:attr-name "JavaScript"
             :attr-desc "Expertise in modern JavaScript development, including React and functional programming tools like Ramda."}])
   (skill
    :id "frontend-development"
    :svg (svg/clojurescript)
    :name "Frontend Development"
    :desc "Building interactive, responsive user interfaces with modern frontend technologies."
    :attrs [{:attr-name "UI Frameworks"
             :attr-desc "Hands-on experience with React and ClojureScript-based libraries to build dynamic, user-centric applications."}
            {:attr-name "State Management"
             :attr-desc "Extensive use of Re-frame for predictable state management."}])
   (skill
    :id "backend-development"
    :svg (svg/clojure)
    :name "Backend Development"
    :desc "Designing and implementing scalable, maintainable backend systems with Clojure and other tools."
    :attrs [{:attr-name "Architectural Patterns"
             :attr-desc "Experience designing and implementing decoupled architectures with tools like Polylith and Integrant."}
            {:attr-name "Integration Tools"
             :attr-desc "Knowledge of messaging systems like Google Pub/Sub for event-driven applications."}])
   (skill
    :id "cloud-infrastructure"
    :svg (svg/google-cloud)
    :name "Cloud & Infrastructure"
    :desc "Deploying and managing cloud-based systems with Google Cloud Platform and other cloud services."
    :attrs [{:attr-name "Google Cloud Platform"
             :attr-desc "Proficient in Datastore and BigQuery for scalable data management, Kubernetes for container orchestration, and Pub/Sub for asynchronous messaging."}
            {:attr-name "DevOps Practices"
             :attr-desc "Familiar with CI/CD automation and containerization using Docker."}])])


(defn feature [& {:keys [svg name attrs link]}]
  [:div
   [:div
    {:class "flex items-center justify-center w-16 h-16 mb-4 rounded-full bg-gray-100 shadow-2xl"}
    [:div {:class "p-3"} 
     svg]]
   [:h6 {:class "mb-2 text-gray-500 font-medium uppercase leading-5"} name]
   [:ul
    {:class "mb-4 -ml-1 space-y-2"}
    (for [attr attrs]
      [:li
       {:class "flex items-start"}
       [:span
        {:class "-ml-10 mr-1 text-gray-500"}
        (svg/lightning)]
       attr])]
   [:a
    {:href link,
     :aria-label "",
     :class "inline-flex items-center font-semibold transition-colors duration-200 cursor-pointer text-metagray hover:text-metagray"}
    [:p
     {:class "flex items-center hover:space-x-2"}
     "Learn more"
     (svg/arrow)]]])

(defn features []
  [:div
   {:class "px-4 py-8 mx-auto sm:max-w-xl md:max-w-full lg:max-w-screen-xl md:px-24 lg:px-8 lg:py-16"}
   [:div
    {:class "flex flex-col mb-6 lg:flex-row md:mb-10"}
    [:div
     {:class "lg:w-1/2"}
     [:h2
      {:class "max-w-md mb-6 text-4xl font-medium tracking-tight text-metagray sm:text-5xl sm:leading-none xl:max-w-lg"}
      "Technical Landscape"]]
    [:div
     {:class "lg:w-1/2"}
     [:p
      {:class "text-base text-gray-700 md:text-lg"}
      "Showcasing expertise in modern tools, frameworks, and best practices for scalable software development."]]]
   [:div
    {:class "grid gap-8 row-gap-10 sm:grid-cols-2 lg:grid-cols-4"}
    (feature
     :svg (svg/lisp)
     :name "Languages & Paradigms" 
     :attrs ["Clojure" "ClojureScript"]
     :link "/about-me#languages-paradigms")
    (feature
     :svg (svg/clojurescript)
     :name "Frontend Development" 
     :attrs ["UI Frameworks" "State Management"]
     :link "/about-me#frontend-development")
    (feature
     :svg (svg/clojure)
     :name "Backend Development" 
     :attrs ["Architectual Patterns" "Integration Tools"]
     :link "/about-me#backend-development")
    (feature
     :svg (svg/google-cloud)
     :name "Cloud & Infrastructure" 
     :attrs ["Google Cloud Platform" "DevOps Practices"]
     :link "/about-me#cloud-infrastructure")]])


(defn human-features []
  [:section
   {:class "text-metagray bg-white"}
   [:div
    {:class "px-4 py-8 mx-auto sm:max-w-xl md:max-w-full lg:max-w-screen-xl md:px-24 lg:px-8 lg:py-16"}
    [:div
     {:class "p-8"}
     [:div
      {:class "flex flex-col items-center justify-center"}
      [:span
       {:class "rounded-full bg-gray-500 px-2 py-1 text-white uppercase text-sm"}
       "New"]]
     [:h1
      {:class "text-4xl font-medium text-gray-700 text-center mt-6"}
      "Human"]
     [:p
      {:class "text-center mt-6 text-lg font-light text-gray-500"}
      "I'm a software engineer with a passion for building scalable, maintainable systems that solve real-world problems. I specialize in Clojure and ClojureScript development, with experience in frontend and backend technologies."]]
    [:div
     {:class "grid grid-cols-1 md:grid-cols-3"}
     [:div
      {:class "p-8"}
      [:div
       {:class "bg-gray-100 rounded-full w-16 h-16 flex justify-center items-center text-gray-500 shadow-2xl p-3"}
       (svg/collaboration)]
      [:h2
       {:class "uppercase mt-6 text-gray-500 font-medium mb-3"}
       "Team Collaboration"]
      [:p
       {:class "font-light text-sm text-gray-500 mb-3"}
       "Collaborative team player with a strong focus on effective communication and teamwork."]
      [:a
       {:class "text-gray-500 flex items-center hover:text-gray-600",
        :href "/"}
       "Read more"
       (svg/greater->)]]
     [:div
      {:class "p-8"}
      [:div
       {:class "bg-zinc-100 rounded-full w-16 h-16 flex justify-center items-center text-zinc-500 shadow-2xl p-3"}
       (svg/mentorship)]
      [:h2
       {:class "uppercase mt-6 text-zinc-500 font-medium mb-3"}
       "Mentorship"]
      [:p
       {:class "font-light text-sm text-gray-500 mb-3"}
       "Experienced in mentoring and guiding junior developers to enhance team capabilities."]
      [:a
       {:class "text-zinc-500 flex items-center hover:text-zin-600",
        :href "/"}
       "Read more"
       (svg/greater->)]]
     [:div
      {:class "p-8"}
      [:div
       {:class "bg-neutral-100 rounded-full w-16 h-16 flex justify-center items-center text-neutral-500 shadow-2xl p-3"}
       (svg/code)]
      [:h2
       {:class "uppercase mt-6 text-neutral-500 font-medium mb-3"}
       "Clean Code Advocate"]
      [:p
       {:class "font-light text-sm text-gray-500 mb-3"}
       "Passionate about writing clean, maintainable, and functional code for long-term success."]
      [:a
       {:class "text-neutral-500 flex items-center hover:text-neutral-600",
        :href "/"}
       "Read more"
       (svg/greater->)]]]]])
