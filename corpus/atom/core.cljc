(ns atom.core)

(swap! @(atom nil) 1)
(swap-vals! @(atom nil) 1)
(reset! @(atom nil) 1)
(reset-vals! @(atom nil) 1)