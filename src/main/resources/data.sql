INSERT INTO category (description) VALUES ('American')
INSERT INTO category (description) VALUES ('Mexican')
INSERT INTO category (description) VALUES ('Italian')
INSERT INTO category (description) VALUES ('Fast Food')
INSERT INTO category (description) VALUES ('Pies')
INSERT INTO category (description) VALUES ('Desserts')
INSERT INTO unit_of_measure (description) VALUES ('teaspoon')
INSERT INTO unit_of_measure (description) VALUES ('tablespoon')
INSERT INTO unit_of_measure (description) VALUES ('cup')
INSERT INTO unit_of_measure (description) VALUES ('pinch')
INSERT INTO unit_of_measure (description) VALUES ('pint')
INSERT INTO unit_of_measure (description) VALUES ('ounce')
INSERT INTO unit_of_measure (description) VALUES ('')
INSERT INTO unit_of_measure (description) VALUES ('each')
INSERT INTO unit_of_measure (description) VALUES ('dash')
INSERT INTO unit_of_measure (description) VALUES ('gramm')

INSERT INTO recipe (description, cook_time, prep_time) VALUES ('apple pie', 1, 2)

INSERT INTO recipe_category (recipe_id, category_id) VALUES ( 1, 1 )
INSERT INTO recipe_category (recipe_id, category_id) VALUES ( 1, 5 )
INSERT INTO recipe_category (recipe_id, category_id) VALUES ( 1, 6 )

INSERT INTO ingredient (description, amount, unit_of_measure_id, recipe_id ) VALUES ('apple', 3, 6, 1)
INSERT INTO ingredient (description, amount, unit_of_measure_id, recipe_id ) VALUES ('flour', 6, 2, 1)
INSERT INTO ingredient (description, amount, unit_of_measure_id, recipe_id ) VALUES ('vanilla', 1, 1, 1)

INSERT INTO recipe (description, cook_time, prep_time) VALUES ('pasta', 1, 1)

INSERT INTO recipe_category (recipe_id, category_id) VALUES ( 2, 3 )

INSERT INTO ingredient (description, amount, unit_of_measure_id, recipe_id ) VALUES ('pasta', 300, 7, 2)
INSERT INTO ingredient (description, amount, unit_of_measure_id, recipe_id ) VALUES ('cream', 2, 3, 2)
INSERT INTO ingredient (description, amount, unit_of_measure_id, recipe_id ) VALUES ('cheese', 12, 5, 2)