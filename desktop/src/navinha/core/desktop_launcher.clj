(ns navinha.core.desktop-launcher
  (:require [navinha.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. navinha-game "navinha" 800 600)
  (Keyboard/enableRepeatEvents true))
